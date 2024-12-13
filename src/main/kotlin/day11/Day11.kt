package day11

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import utils.forEachParallel
import utils.runDay
import utils.runPart

fun day11() {
    runDay(11) {
        runPart(1, iterations = 1000) { part(25) }
        runPart(2, iterations = 1000) { part(75) }
    }
}

private fun part(blinks: Int): Long = runBlocking(Dispatchers.Default) {
    val stones = getStones()
    val cacheCache = mutableMapOf<Long, MutableMap<Long, Long>>()
    stones.forEach { cacheCache[it] = mutableMapOf(it to 1) }
    stones.forEachParallel { stone ->
        (0 until blinks).forEach { _ ->
            val cache = cacheCache[stone]!!
            val cacheCopy = cache.toMap()
            cacheCopy.forEach { (stone, amount) ->
                val result = stone.blink()
                cache[stone] = cache[stone]!! - amount
                if (cache[stone] == 0L) cache.remove(stone)
                result.forEach {
                    if (cache[it] == null) {
                        cache[it] = amount
                    } else {
                        cache[it] = cache[it]!! + amount
                    }
                }
            }
        }
    }

    return@runBlocking cacheCache.toList()
        .flatMap { it.second.toList() }
        .sumOf { it.second }
}


fun Long.blink(): List<Long> {
    return when {
        this == 0L -> listOf(1)
        this.toString().length % 2 == 0 -> {
            val string = this.toString()
            val left = string.substring(0 until string.length / 2).toLong()
            val right = string.substring(string.length / 2 until string.length).toLong()
            listOf(left, right)
        }

        else -> listOf(this * 2024)
    }
}

private fun getStones(): List<Long> {
    return INPUT_DAY_11.split(" ").map { it.toLong() }
}