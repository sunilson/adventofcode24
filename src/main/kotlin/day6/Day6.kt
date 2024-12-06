package day6

import day6.MapElement.Patrol.Direction
import kotlinx.coroutines.*
import utils.runDay
import utils.runPart


fun day6() {
    runDay(6) {
        runPart(1) { part1() }
        runPart(2) { part2() }
    }
}

private fun part1(): Int {
    val map = getMap()
    val controlMap = map.map { it.toMutableList() }.toMutableList()
    val mapWidth = map.first().size
    val mapHeight = map.size
    var patrol = map.flatten().first { it is MapElement.Patrol } as MapElement.Patrol
    val visitedCoordinates = mutableSetOf(patrol.x to patrol.y)

    while (true) {
        patrol = getNextPositionForPatrol(patrol, map, mapWidth, mapHeight)
        if (patrol.x in 0..<mapWidth && patrol.y in 0..<mapHeight) {
            visitedCoordinates.add(patrol.x to patrol.y)
            controlMap[patrol.y][patrol.x] = patrol
        } else {
            break
        }
    }

    return visitedCoordinates.size
}

@Suppress("UNREACHABLE_CODE")
fun part2(): Int = runBlocking {
    val map = getMap()
    val mapWidth = map.first().size
    val mapHeight = map.size
    val initialPatrol = map.flatten().first { it is MapElement.Patrol } as MapElement.Patrol
    val jobs = map.flatMapIndexed { rowIndex, row ->
        row.mapIndexed { columnIndex, element ->
            async {
                withContext(Dispatchers.Default) {
                    if (element is MapElement.Block || element is MapElement.Patrol) return@withContext false

                    val innerMap = map.toMutableList().map { it.toMutableList() }
                    var patrol = initialPatrol.copy()
                    val previousDirectionChanges = mutableSetOf<Pair<Pair<Int, Int>, Direction>>()

                    innerMap[rowIndex][columnIndex] = MapElement.Block(columnIndex, rowIndex)
                    while (true) {
                        patrol = getNextPositionForPatrol(patrol, innerMap, mapWidth, mapHeight)

                        val prevDirectionChange = previousDirectionChanges.lastOrNull()
                        val isNullAndNotTopDirection = prevDirectionChange == null && patrol.direction != Direction.TOP
                        val isNotNullAndChange =
                            prevDirectionChange != null && patrol.direction != prevDirectionChange.second

                        if (isNullAndNotTopDirection || isNotNullAndChange) {
                            if (!previousDirectionChanges.add((patrol.x to patrol.y) to patrol.direction)) {
                                return@withContext true
                            }
                        }

                        if (patrol.x !in 0..<mapWidth || patrol.y !in 0..<mapHeight) {
                            return@withContext false
                        }
                    }

                    return@withContext false
                }
            }
        }
    }

    return@runBlocking jobs.awaitAll().count { it }
}

private fun getNextPositionForPatrol(
    patrol: MapElement.Patrol,
    map: List<List<MapElement>>,
    mapWidth: Int,
    mapHeight: Int
): MapElement.Patrol {
    val newCoordinate = when (patrol.direction) {
        Direction.TOP -> patrol.x to patrol.y - 1
        Direction.LEFT -> patrol.x - 1 to patrol.y
        Direction.RIGHT -> patrol.x + 1 to patrol.y
        Direction.BOTTOM -> patrol.x to patrol.y + 1
    }

    if (newCoordinate.first !in 0..<mapWidth || newCoordinate.second !in 0..<mapHeight) {
        return patrol.copy(x = newCoordinate.first, y = newCoordinate.second)
    }

    val isBlocked = map[newCoordinate.second][newCoordinate.first] is MapElement.Block

    if (!isBlocked) {
        return patrol.copy(x = newCoordinate.first, y = newCoordinate.second)
    } else {
        val directionIndex = Direction.entries.indexOf(patrol.direction)
        val nextIndex = if (directionIndex == Direction.entries.lastIndex) 0 else directionIndex + 1
        return getNextPositionForPatrol(
            patrol.copy(direction = Direction.entries[nextIndex]),
            map,
            mapWidth,
            mapHeight
        )
    }
}


sealed class MapElement {

    abstract val x: Int
    abstract val y: Int

    data class Empty(override val x: Int, override val y: Int) : MapElement() {
        override fun toString(): String {
            return "."
        }
    }

    data class Block(override val x: Int, override val y: Int) : MapElement() {
        override fun toString(): String {
            return "#"
        }
    }

    data class Patrol(override val x: Int, override val y: Int, val direction: Direction) : MapElement() {
        override fun toString(): String {
            return when (direction) {
                Direction.TOP -> "^"
                Direction.LEFT -> "<"
                Direction.RIGHT -> ">"
                Direction.BOTTOM -> "v"
            }
        }

        enum class Direction {
            TOP, RIGHT, BOTTOM, LEFT
        }
    }
}

private fun getMap(): List<List<MapElement>> {
    val input = INPUT_DAY_6
    return input.split("\n")
        .mapIndexed { row, line ->
            line.mapIndexed { column, char ->
                when (char) {
                    '^', '>', '<', 'v' -> {
                        MapElement.Patrol(
                            column,
                            row,
                            when (char) {
                                '^' -> Direction.TOP
                                '>' -> Direction.RIGHT
                                '<' -> Direction.LEFT
                                else -> Direction.BOTTOM
                            }
                        )
                    }

                    '#' -> MapElement.Block(column, row)
                    else -> MapElement.Empty(column, row)
                }
            }
        }
}