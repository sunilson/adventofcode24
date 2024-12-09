package day3

import utils.runDay
import utils.runPart
import java.io.File

fun day3() {
    runDay(3) {
        runPart(1, iterations = 100) { part1() }
        runPart(2, iterations = 100) { part2() }
    }
}

private fun part1(): Int {
    val text = File("src/main/kotlin/day3/Day3Inputs.txt").readText()
    val instructionMatcher = "(?<=mul\\()[0-9]*,[0-9]*(?=\\))".toRegex()
    return instructionMatcher.findAll(text)
        .map {
            val (number1, number2) = it.value.split(",")
            number1.toInt() * number2.toInt()
        }
        .sumOf { it }
}

@Suppress("SpellCheckingInspection")
private fun part2(): Int {
    var text = File("src/main/kotlin/day3/Day3Inputs.txt").readText()
    val mulRegex = "^mul\\([0-9]*,[0-9]*\\)".toRegex()
    var result = 0
    var isDo = true
    var i = 0

    while (i < text.length) {
        when (text[i]) {
            'm' -> {
                if (isDo) {
                    val lookAheadRegexResult = lookAheadRegex(i, text, mulRegex)
                    if (lookAheadRegexResult != null) {
                        i += lookAheadRegexResult.length - 1
                        val (number1, number2) = lookAheadRegexResult.replace("mul(", "")
                            .replace(")", "")
                            .split(",")
                        result += number1.toInt() * number2.toInt()
                    }
                }
            }

            'd' -> {
                if (lookAhead(i, text, "do()")) {
                    isDo = true
                    i += 2
                } else if (lookAhead(i, text, "don't()")) {
                    isDo = false
                    i += 5
                }
            }
        }

        i++
    }

    return result
}

fun lookAheadRegex(index: Int, input: String, regex: Regex): String? {
    return regex.find(input.substring(index))?.value
}

fun lookAhead(index: Int, input: String, term: String): Boolean {
    return input.substring(index, index + term.length) == term
}