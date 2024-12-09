package day9

import utils.runDay
import utils.runPart
import java.io.DataOutput
import kotlin.math.abs

fun day9() {
    runDay(9) {
        runPart(1, iterations = 20) { part1() }
        runPart(2, iterations = 20) { part2() }
    }
}

private fun part1(): Long {
    val compressed = compress(getUncompressed())
    compressed.foldIndexed(0L) { index, acc, c ->
        if (c == ".") return acc
        acc + (c.toInt() * index)
    }

    return 0
}


private fun part2(): Long {
    val compressed = compress2(getUncompressed2())
    return compressed.flatten()
        .foldIndexed(0L) { index, acc, s ->
            if (s == ".") return@foldIndexed acc
            acc + (s.toInt() * index)
        }
}

private fun compress(
    input: MutableList<String>,
): MutableList<String> {
    val emptyIndices = input.mapIndexedNotNull { index, s -> if (s == ".") index else null }
        .toMutableList()

    input.reversed().forEachIndexed { index, char ->
        val actualIndex = input.lastIndex - index
        val minEmptyIndex = emptyIndices.min()
        if (actualIndex < minEmptyIndex) {
            return input
        }

        if (char != "." && emptyIndices.isNotEmpty()) {
            val firstEmptyIndex = emptyIndices.removeFirst()
            input.swap(actualIndex, firstEmptyIndex)
        }
    }

    return input
}

private fun compress2(
    input: MutableList<MutableList<String>>,
): MutableList<MutableList<String>> {
    val emptyIndices = input.mapIndexedNotNull { index, list -> if (list.first() == ".") index else null }
        .toMutableList()

    input.reversed()
        .forEachIndexed { reverseIndex, list ->
            val forwardIndex = input.size - reverseIndex
            val fittingEmptyIndex = emptyIndices
                .firstOrNull { it < forwardIndex && input[it].filter { it == "." }.size >= list.size } ?: -1
            if (fittingEmptyIndex == -1) return@forEachIndexed

            val emptySlot = input[fittingEmptyIndex]
            val firstEmptyIndex = emptySlot.indexOfFirst { it == "." }
            val fillingIndex = if (firstEmptyIndex != -1) firstEmptyIndex else 0

            list.forEachIndexed { index, s -> emptySlot[index + fillingIndex] = s }
            list.apply {
                val size = this.size
                clear()
                addAll((0 until size).map { "." })
            }

            if (emptySlot.none { it == "." }) {
                emptyIndices.remove(fittingEmptyIndex)
            }
        }

    return input
}

private fun getUncompressed(): MutableList<String> {
    var isEmptySpace = false
    var index = 0
    return buildList {
        INPUT_DAY_9.trim()
            .forEach {
                val number = it.digitToInt()

                if (isEmptySpace) {
                    (0 until number).forEach { _ -> add(".") }
                } else {
                    (0 until number).forEach { _ -> add("$index") }
                    index++
                }

                isEmptySpace = !isEmptySpace
            }
    }.toMutableList()
}

private fun getUncompressed2(): MutableList<MutableList<String>> {
    var isEmptySpace = false
    var index = 0
    return buildList<MutableList<String>> {
        INPUT_DAY_9.trim()
            .forEach {
                val number = it.digitToInt()

                if (isEmptySpace) {
                    add((0 until number).map { _ -> "." }.toMutableList())
                } else {
                    add((0 until number).map { _ -> "$index" }.toMutableList())
                    index++
                }

                isEmptySpace = !isEmptySpace
            }
    }.filter { it.isNotEmpty() }.toMutableList()
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int): MutableList<T> = apply {
    val tmp1 = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp1
}