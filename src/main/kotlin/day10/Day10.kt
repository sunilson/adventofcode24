package day10

import utils.runDay
import utils.runPart

fun day10() {
    runDay(10) {
        runPart(1, iterations = 1000) { part1() }
        runPart(2, iterations = 1000) { part2() }
    }
}

private fun part1(): Int {
    val map = getMap(INPUT_DAY_10)
    return getTrailHeads(map).sumOf { findPaths(it, map, map.first().indices, map.indices, emptySet()).toSet().size }
}


private fun part2(): Int {
    val map = getMap(INPUT_DAY_10)
    return getTrailHeads(map).sumOf { findPaths(it, map, map.first().indices, map.indices, emptyList()).toList().size }
}

private fun findPaths(
    start: Pair<Int, Int>,
    map: List<List<Int>>,
    mapWidth: IntRange,
    mapHeight: IntRange,
    foundTrailEnds: Iterable<Pair<Int, Int>>
): Iterable<Pair<Int, Int>> {
    val (x, y) = start
    val currentHeight = map[y][x]

    if (currentHeight == 9) {
        return foundTrailEnds + start
    }

    val canGoLeft = (x - 1) in mapWidth && map[y][x - 1] == (currentHeight + 1)
    val canGoRight = (x + 1) in mapWidth && map[y][x + 1] == (currentHeight + 1)
    val canGoTop = (y - 1) in mapHeight && map[y - 1][x] == (currentHeight + 1)
    val canGoBottom = (y + 1) in mapHeight && map[y + 1][x] == (currentHeight + 1)

    val leftCount = if (canGoLeft) findPaths(x - 1 to y, map, mapWidth, mapHeight, foundTrailEnds) else emptySet()
    val rightCount = if (canGoRight) findPaths(x + 1 to y, map, mapWidth, mapHeight, foundTrailEnds) else emptySet()
    val topCount = if (canGoTop) findPaths(x to y - 1, map, mapWidth, mapHeight, foundTrailEnds) else emptySet()
    val bottomCount = if (canGoBottom) findPaths(x to y + 1, map, mapWidth, mapHeight, foundTrailEnds) else emptySet()

    return leftCount + rightCount + topCount + bottomCount
}

private fun getMap(input: String): List<List<Int>> {
    return input.trim()
        .split("\n")
        .map { line ->
            line.trim()
                .map { if (it == '.') -1 else it.digitToInt() }
        }
}

private fun getTrailHeads(map: List<List<Int>>): List<Pair<Int, Int>> {
    return map.mapIndexed { y, row ->
        row.mapIndexedNotNull { x, digit ->
            if (digit == 0) x to y else null
        }
    }.flatten()
}