package day10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import utils.mapParallel
import utils.runDay
import utils.runPart

fun day10() {
    runDay(10) {
        runPart(1, iterations = 10000) { part1() }
        runPart(2, iterations = 10000) { part2() }
    }
}

private fun part1(): Int = runBlocking(Dispatchers.Default) {
    val map = getMap(INPUT_DAY_10)
    getTrailEnds(map).mapParallel {
        findPaths(it, map, map.first().indices, map.indices, emptySet()).toSet().size
    }.sum()
}

private fun part2(): Int = runBlocking(Dispatchers.Default) {
    val map = getMap(INPUT_DAY_10)
    getTrailEnds(map).mapParallel {
        findPaths(it, map, map.first().indices, map.indices, emptyList()).toList().size
    }.sum()
}

private fun findPaths(
    end: Pair<Int, Int>,
    map: List<List<Int>>,
    mapWidth: IntRange,
    mapHeight: IntRange,
    foundTrailStarts: Iterable<Pair<Int, Int>>
): Iterable<Pair<Int, Int>> {
    val (x, y) = end
    val currentHeight = map[y][x]

    if (currentHeight == 0) {
        return foundTrailStarts + end
    }

    val canGoLeft = (x - 1) in mapWidth && map[y][x - 1] == (currentHeight - 1)
    val canGoRight = (x + 1) in mapWidth && map[y][x + 1] == (currentHeight - 1)
    val canGoTop = (y - 1) in mapHeight && map[y - 1][x] == (currentHeight - 1)
    val canGoBottom = (y + 1) in mapHeight && map[y + 1][x] == (currentHeight - 1)

    val leftCount = if (canGoLeft) findPaths(x - 1 to y, map, mapWidth, mapHeight, foundTrailStarts) else emptySet()
    val rightCount = if (canGoRight) findPaths(x + 1 to y, map, mapWidth, mapHeight, foundTrailStarts) else emptySet()
    val topCount = if (canGoTop) findPaths(x to y - 1, map, mapWidth, mapHeight, foundTrailStarts) else emptySet()
    val bottomCount = if (canGoBottom) findPaths(x to y + 1, map, mapWidth, mapHeight, foundTrailStarts) else emptySet()

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

private fun getTrailEnds(map: List<List<Int>>): List<Pair<Int, Int>> {
    return map.mapIndexed { y, row ->
        row.mapIndexedNotNull { x, digit ->
            if (digit == 9) x to y else null
        }
    }.flatten()
}