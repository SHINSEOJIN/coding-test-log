package step0_1

import kotlin.random.Random

fun main() {
    lottomachine()
}

fun lottomachine() {
    val numbers = mutableListOf<Int>()

    while (numbers.size < 6) {
        val number = Random.nextInt(1, 46)
        if (!numbers.contains(number)) {
            numbers.add(number)
        }
    }
    println(numbers.sorted())
}
