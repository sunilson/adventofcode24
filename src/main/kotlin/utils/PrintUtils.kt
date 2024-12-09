package utils

import kotlin.time.measureTimedValue

inline fun runDay(day: Int, block: () -> Unit) {
    println()
    println()
    println("----------------------------")
    println("## Day $day")
    block()
}

inline fun <T> runPart(part: Int, iterations: Int, block: () -> T) {
    val timePart = (0..<iterations).map {
        measureTimedValue { block() }
    }.minBy { it.duration }

    println("Ran Part $part in ${timePart.duration} with result: ${timePart.value} with $iterations iterations")
}