package day7

import day7.Operator.*
import kotlinx.coroutines.*
import utils.mapParallel
import utils.runDay
import utils.runPart


fun day7() {
    runDay(7) {
        runPart(1) { part(possibleOperators = listOf(ADD, MULTIPLY)) }
        runPart(2) { part(possibleOperators = listOf(ADD, MULTIPLY, COMBINE)) }
    }
}

private fun part(possibleOperators: List<Operator>) = runBlocking(Dispatchers.Default) {
    val equations = getEquations()
    val allPossiblePermutations = mutableMapOf<Int, List<List<Operator>>>()
    equations.mapParallel { (expectedResult, equationParts) ->
        val possiblePermutations =
            allPossiblePermutations.getOrElse(equationParts.size) { emptyList() }.toMutableList()

        fun calculatePossiblePermutations(operators: List<Operator>, depth: Int) {
            if (depth == 0) {
                possiblePermutations.add(operators)
            } else {
                possibleOperators.forEach {
                    calculatePossiblePermutations(operators + it, depth - 1)
                }
            }
        }

        if (possiblePermutations.isEmpty()) {
            calculatePossiblePermutations(emptyList(), equationParts.size)
            allPossiblePermutations[equationParts.size] = possiblePermutations
        }

        possiblePermutations.forEach { permutation ->
            if (
                solveEquation(
                    expectedResult = expectedResult,
                    equation = buildList {
                        equationParts.forEachIndexed { index, number ->
                            add(number)
                            add(permutation[index])
                        }
                    }.dropLast(1)
                )
            ) {
                return@mapParallel expectedResult
            }
        }

        0L
    }.sum()
}

private fun solveEquation(
    expectedResult: Long,
    equation: List<Any>
): Boolean {
    var result = equation.first() as Long
    var index = 1
    while (index <= equation.size) {
        val operator = equation.getOrNull(index) as? Operator ?: break
        val nextNumber = equation[index + 1] as Long
        result = when (operator) {
            ADD -> result + nextNumber
            MULTIPLY -> result * nextNumber
            COMBINE -> (result.toString() + nextNumber.toString()).toLong()
        }
        index += 2
    }

    return result == expectedResult
}

enum class Operator {
    ADD, MULTIPLY, COMBINE
}

private fun getEquations(): List<Pair<Long, List<Long>>> {
    return INPUT_DAY_7.split("\n")
        .map { line ->
            val result = line.substringBefore(":").toLong()
            val parts = line.substringAfter(":")
                .trim()
                .split(" ")
                .map { it.toLong() }
            result to parts
        }
}
