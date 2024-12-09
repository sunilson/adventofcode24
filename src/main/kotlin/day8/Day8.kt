package day8

import utils.runDay
import utils.runPart
import kotlin.math.abs

fun day8() {
    runDay(8) {
        runPart(1, iterations = 100) { part1() }
        runPart(2, iterations = 100) { part2() }
    }
}

private fun part1(): Int {
    val map = getMap()
    val pairs = buildList<Pair<Antenna, Antenna>> {
        getOccurencesInMap(map).forEach { (_, antennas) ->
            val ignoredCoordinates = mutableListOf<Pair<Int, Int>>()
            antennas.forEach { antenna ->
                antennas.filter { it.coordinates != antenna.coordinates && !ignoredCoordinates.contains(it.coordinates) }
                    .forEach { secondAntenna ->
                        add(antenna to secondAntenna)
                    }
                ignoredCoordinates.add(antenna.coordinates)
            }
        }
    }

    val antinodes = pairs.map { (antenna1, antenna2) ->
        val differenceX = abs(antenna1.coordinates.first - antenna2.coordinates.first)
        val differenceY = abs(antenna1.coordinates.second - antenna2.coordinates.second)
        val antenna1DirectionX = if (antenna1.coordinates.first < antenna2.coordinates.first) -1 else 1
        val antenna1DirectionY = if (antenna1.coordinates.second < antenna2.coordinates.second) -1 else 1
        val antenna2DirectionX = antenna1DirectionX * -1
        val antenna2DirectionY = antenna1DirectionY * -1

        fun getNextX(directionX: Int, currentX: Int): Int {
            return if (directionX == -1) currentX - differenceX else currentX + differenceX
        }

        fun getNextY(directionY: Int, currentY: Int): Int {
            return if (directionY == -1) currentY - differenceY else currentY + differenceY
        }

        listOf(
            getNextX(antenna1DirectionX, antenna1.coordinates.first) to getNextY(
                antenna1DirectionY,
                antenna1.coordinates.second
            ),
            getNextX(antenna2DirectionX, antenna2.coordinates.first) to getNextY(
                antenna2DirectionY,
                antenna2.coordinates.second
            ),
        )
    }.flatten()

    val mapWidth = map.first().size
    val mapHeight = map.size
    return antinodes.filter { (x, y) -> x in 0..<mapWidth && y in 0..<mapHeight }
        .distinct()
        .size
}

private fun part2(): Int {
    val map = getMap()
    val mapWidth = map.first().size
    val mapHeight = map.size
    val pairs = buildList<Pair<Antenna, Antenna>> {
        getOccurencesInMap(map).forEach { (_, antennas) ->
            val ignoredCoordinates = mutableListOf<Pair<Int, Int>>()
            antennas.forEach { antenna ->
                antennas.filter { it.coordinates != antenna.coordinates && !ignoredCoordinates.contains(it.coordinates) }
                    .forEach { secondAntenna ->
                        add(antenna to secondAntenna)
                    }
                ignoredCoordinates.add(antenna.coordinates)
            }
        }
    }

    val antinodes = pairs.map { (antenna1, antenna2) ->
        val differenceX = abs(antenna1.coordinates.first - antenna2.coordinates.first)
        val differenceY = abs(antenna1.coordinates.second - antenna2.coordinates.second)
        val antenna1DirectionX = if (antenna1.coordinates.first < antenna2.coordinates.first) -1 else 1
        val antenna1DirectionY = if (antenna1.coordinates.second < antenna2.coordinates.second) -1 else 1
        val antenna2DirectionX = antenna1DirectionX * -1
        val antenna2DirectionY = antenna1DirectionY * -1

        fun getNextX(directionX: Int, currentX: Int): Int {
            return if (directionX == -1) currentX - differenceX else currentX + differenceX
        }

        fun getNextY(directionY: Int, currentY: Int): Int {
            return if (directionY == -1) currentY - differenceY else currentY + differenceY
        }

        val antinode1List = buildList<Pair<Int, Int>> {
            add(antenna1.coordinates)
            var currentX = getNextX(antenna1DirectionX, antenna1.coordinates.first)
            var currentY = getNextY(antenna1DirectionY, antenna1.coordinates.second)
            while (currentX in 0..<mapWidth && currentY in 0..<mapHeight) {
                add(currentX to currentY)
                currentX = getNextX(antenna1DirectionX, currentX)
                currentY = getNextY(antenna1DirectionY, currentY)
            }
        }

        val antinode2List = buildList<Pair<Int, Int>> {
            add(antenna2.coordinates)
            var currentX = getNextX(antenna2DirectionX, antenna2.coordinates.first)
            var currentY = getNextY(antenna2DirectionY, antenna2.coordinates.second)
            while (currentX in 0..<mapWidth && currentY in 0..<mapHeight) {
                add(currentX to currentY)
                currentX = getNextX(antenna2DirectionX, currentX)
                currentY = getNextY(antenna2DirectionY, currentY)
            }
        }

        antinode1List + antinode2List
    }.flatten()

    return antinodes.filter { (x, y) -> x in 0..<mapWidth && y in 0..<mapHeight }
        .distinct()
        .size
}

private fun getMap(): List<List<Char>> {
    return INPUT_DAY_8.split("\n")
        .map { line -> line.trim().toList() }
}

private fun getOccurencesInMap(map: List<List<Char>>): Map<Char, List<Antenna>> {
    val result = mutableMapOf<Char, MutableList<Antenna>>()
    map.asSequence()
        .forEachIndexed { row, line ->
            line.forEachIndexed inner@{ column, s ->
                if (s == '.') return@inner
                if (result[s] == null) result[s] = mutableListOf()
                result[s]!!.add(Antenna(s, column to row))
            }
        }
    return result
}

data class Antenna(
    val character: Char,
    val coordinates: Pair<Int, Int>
)