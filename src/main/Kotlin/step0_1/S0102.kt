package step0_1

import kotlin.random.Random

fun main() {
    lottomachine()
}

fun lottomachine() {
    val numbers = mutableListOf<Int>()

    for (i in 1..6) {
        val number = Random.nextInt(1, 46)
        numbers.add(number)
    }
    println(numbers.sorted())
}