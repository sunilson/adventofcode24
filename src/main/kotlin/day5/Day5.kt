package day5

import utils.runDay
import utils.runPart


fun day5() {
    runDay(5) {
        runPart(1, iterations = 100) { part1() }
        runPart(2, iterations = 100) { part2() }
    }
}

private fun part1(): Int {
    val orderingRules = getOrderingRules()
    val updates = getUpdates()
    val sortedUpdates = updates.map { update -> update.toMutableList().orderUpdate(orderingRules) }
    val correctUpdates = updates.filterIndexed { index, update -> sortedUpdates[index] == update }
    return correctUpdates.sumOf { it[(it.size / 2)] }
}

fun part2(): Int {
    val orderingRules = getOrderingRules()
    val updates = getUpdates()
    val sortedUpdates = updates.map { update -> update.toMutableList().orderUpdate(orderingRules) }
    val incorrectUpdates = sortedUpdates.filterIndexed { index, update -> updates[index] != update }
    return incorrectUpdates.sumOf { it[(it.size / 2)] }
}

private fun getOrderingRules(): Map<Int, Set<Int>> {
    val input = INPUT_DAY_5.split("\n\n").first().trim()
    val orderRules = mutableMapOf<Int, Set<Int>>()

    input.split("\n")
        .forEach { line ->
            val (before, after) = line.split("|").map { it.toInt() }
            val existingSet = orderRules[before] ?: mutableSetOf()
            orderRules[before] = existingSet.plus(after)
        }

    return orderRules
}

private fun getUpdates(): List<List<Int>> {
    val input = INPUT_DAY_5.split("\n\n").last().trim()
    return input.split("\n")
        .map { line -> line.split(",").map { it.toInt() } }
}

private fun MutableList<Int>.orderUpdate(orderingRules: Map<Int, Set<Int>>): List<Int> {
    val newList = mutableListOf<Int>()
    val relevantOrderingRules = orderingRules.filter { this.contains(it.key) }.toMutableMap()
    val initialSize = size

    while (newList.size < initialSize) {
        val beforeAllOther = first { number ->
            relevantOrderingRules.filter { rule ->
                rule.key != number && rule.value.contains(number)
            }.isEmpty()
        }
        newList.add(beforeAllOther)
        remove(beforeAllOther)
        relevantOrderingRules.remove(beforeAllOther)
    }

    return newList
}