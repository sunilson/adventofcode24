package utils

import kotlin.time.measureTimedValue

fun runDay(day: Int, block: () -> Unit) {
    println()
    println("---------- Day $day ----------")
    block()
    println("----------------------------")
    println()
}

fun <T> runPart(part: Int, block: () -> T) {
    val timePart = (0..0).map {
        measureTimedValue { block() }
    }.minBy { it.duration }

    println("Ran Part $part in ${timePart.duration} with result: ${timePart.value}")
}