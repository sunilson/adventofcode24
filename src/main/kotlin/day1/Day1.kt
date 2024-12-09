package day1

import utils.runDay
import utils.runPart
import kotlin.math.abs

fun day1() {
    runDay(1) {
        runPart(1, iterations = 100) { part1(INPUT_DAY_1) }
        runPart(2, iterations = 100) { part2(INPUT_DAY_1) }
    }
}

private fun getSortedLeftAndRightList(input: String): Pair<List<Int>, List<Int>> {
    val leftList = mutableListOf<Int>()
    val rightList = mutableListOf<Int>()

    input.lines()
        .forEach {
            val splitValues = it.trim().split(" ")
            leftList.add(splitValues.first().toInt())
            rightList.add(splitValues.last().toInt())
        }

    return leftList.sorted() to rightList.sorted()
}

private fun part1(input: String): Int {
    val (sortedLeftList, sortedRightList) = getSortedLeftAndRightList(input)

    val distance = sortedLeftList.foldIndexed(0) { index, acc, leftValue ->
        acc + abs(leftValue - sortedRightList[index])
    }

    return distance
}

private fun part2(input: String): Int {
    val (sortedLeftList, sortedRightList) = getSortedLeftAndRightList(input)

    val rightOccurrenceMap = buildMap {
        sortedRightList.forEach {
            put(it, (get(it) ?: 0) + 1)
        }
    }

    val similarity = sortedLeftList.fold(0) { acc, leftValue ->
        acc + (leftValue * (rightOccurrenceMap[leftValue] ?: 0))
    }

    return similarity
}