package utils

import kotlin.time.measureTimedValue

inline fun runDay(day: Int, block: () -> Unit) {
    println()
    println()
    println("## Day $day")
    println("<table>")
    println("<tr><th>Part</th><th>Result</th><th>Duration</th><th>Iterations</th></tr>")
    block()
    println("</table>")
}

inline fun <T> runPart(part: Int, iterations: Int, block: () -> T) {
    val timePart = (0..<iterations).map {
        measureTimedValue { block() }
    }.minBy { it.duration }

    println("<tr><td>$part</td><td>${timePart.value}</td><td>${timePart.duration}</td><td>$iterations</td></tr>")
}