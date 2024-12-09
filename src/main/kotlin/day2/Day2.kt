package day2

import day1.INPUT_DAY_1
import utils.runDay
import utils.runPart


fun day2() {
    runDay(2) {
        runPart(1, iterations = 100) { part1(INPUT_DAY_2) }
        runPart(2, iterations = 100) { part2(INPUT_DAY_2) }
    }
}

private fun getReportLines(input: String): List<List<Int>> {
    return input.lines()
        .map { line -> line.split(" ").map { it.toInt() } }
}

private fun part1(input: String): Int {
    val reportLines = getReportLines(input)
    var safeCount = 0

    reportLines.forEach { line ->
        safeCount++

        val isIncreasing = line.first() < line[1]
        for (i in line.indices) {
            val value = line[i]
            val nextValue = if (i == line.lastIndex) break else line[i + 1]

            val validRange = if (isIncreasing) {
                (value + 1..value + 3)
            } else {
                (value - 3..<value)
            }

            if (nextValue !in validRange) {
                safeCount--
                break
            }
        }
    }

    return safeCount
}

private fun part2(input: String): Int {
    val reportLines = getReportLines(input)
    var safeCount = 0

    reportLines.forEach { line ->
        if (part2IsSafe(line)) safeCount++
    }

    return safeCount
}

private fun part2IsSafe(line: List<Int>, removedAlready: Boolean = false): Boolean {
    val isIncreasing = line.first() < line[1]
    for (i in line.indices) {
        val value = line[i]
        val nextValue = if (i == line.lastIndex) break else line[i + 1]

        val validRange = if (isIncreasing) {
            (value + 1..value + 3)
        } else {
            (value - 3..<value)
        }

        if (nextValue !in validRange) {
            if (removedAlready) {
                return false
            }

            if (i != 0 && part2IsSafe(line.toMutableList().apply { removeAt(i + -1) }, true)) {
                return true
            }

            if (part2IsSafe(line.toMutableList().apply { removeAt(i) }, true)) {
                return true
            }

            if (i != line.lastIndex && part2IsSafe(line.toMutableList().apply { removeAt(i + 1) }, true)) {
                return true
            }

            return false
        }
    }

    return true
}