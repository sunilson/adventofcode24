package day4

import day4.Direction.*
import utils.runDay
import utils.runPart

fun day4() {
    runDay(4) {
        runPart(1) { part1() }
        runPart(2) { part2() }
    }
}

private fun getMatrix(): List<List<Char>> {
    val input = INPUT_DAY_4
    var line = 0
    val matrix = mutableListOf(mutableListOf<Char>())
    input.forEach { char ->
        if (char == '\n') {
            line++
            matrix.add(mutableListOf())
        } else {
            matrix[line].add(char)
        }
    }
    return matrix
}

private enum class Direction {
    TOP, BOTTOM, LEFT, RIGHT, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT;
}

private fun getNextRowForDirection(row: Int, direction: Direction): Int {
    return when (direction) {
        TOP, TOP_LEFT, TOP_RIGHT -> row - 1
        BOTTOM, BOTTOM_LEFT, BOTTOM_RIGHT -> row + 1
        LEFT, RIGHT -> row
    }
}

private fun getNextColumnForDirection(column: Int, direction: Direction): Int {
    return when (direction) {
        TOP, BOTTOM -> column
        LEFT, TOP_LEFT, BOTTOM_LEFT -> column - 1
        RIGHT, TOP_RIGHT, BOTTOM_RIGHT -> column + 1
    }
}

private fun getCharInDirection(
    matrix: List<List<Char>>,
    direction: Direction,
    row: Int,
    column: Int
): Triple<Char, Int, Int>? {
    val nextRow = getNextRowForDirection(row, direction)
    if (nextRow < 0) return null
    if (nextRow > matrix.lastIndex) return null

    val nextColumn = getNextColumnForDirection(column, direction)
    if (nextColumn < 0) return null
    if (nextColumn > matrix.first().lastIndex) return null

    return Triple(matrix[nextRow][nextColumn], nextRow, nextColumn)
}

private fun part1(): Int {
    val matrix = getMatrix()
    var xmasCount = 0
    matrix.forEachIndexed { row, line ->
        line.forEachIndexed { column, char ->
            if (char == 'X') {
                xmasCount += Direction.entries
                    .map { direction -> part1CheckForXmas(matrix, row, column, direction, "X") }
                    .count { it }
            }
        }
    }

    return xmasCount
}

private fun part1CheckForXmas(
    matrix: List<List<Char>>,
    row: Int,
    column: Int,
    direction: Direction,
    result: String
): Boolean {
    val (nextChar, nextRow, nextColumn) = getCharInDirection(matrix, direction, row, column) ?: return false
    return when (val newResult = result + nextChar) {
        "XMAS" -> true
        "XM", "XMA" -> part1CheckForXmas(matrix, nextRow, nextColumn, direction, newResult)
        else -> false
    }
}

private fun part2(): Int {
    val matrix = getMatrix()
    var xmasCount = 0
    matrix.forEachIndexed { row, line ->
        line.forEachIndexed { column, char ->
            if (char == 'A') {
                if (part2CheckForXMas(matrix, row, column)) {
                    xmasCount++
                }
            }
        }
    }

    return xmasCount
}

private fun part2CheckForXMas(
    matrix: List<List<Char>>,
    row: Int,
    column: Int,
): Boolean {
    val (topLeftChar, _, _) = getCharInDirection(matrix, TOP_LEFT, row, column) ?: return false
    val (topRightChar, _, _) = getCharInDirection(matrix, TOP_RIGHT, row, column) ?: return false
    val (bottomRightChar, _, _) = getCharInDirection(matrix, BOTTOM_RIGHT, row, column) ?: return false
    val (bottomLeftChar, _, _) = getCharInDirection(matrix, BOTTOM_LEFT, row, column) ?: return false
    val leftToRight = (topLeftChar == 'M' && bottomRightChar == 'S') || (bottomRightChar == 'M' && topLeftChar == 'S')
    val rightToLeft = (topRightChar == 'M' && bottomLeftChar == 'S') || (bottomLeftChar == 'M' && topRightChar == 'S')
    return leftToRight && rightToLeft
}