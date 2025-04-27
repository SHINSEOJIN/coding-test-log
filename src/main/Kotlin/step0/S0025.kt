package step0

fun main() {
    println("2")

    var num = readLine()!!.toInt()

    var minus = num - 1
    var plus = num + 1

    if (num in 3..8) {

        for (i in 1..9) {
            println("$minus * $i = ${i * minus}")
        }
        for (i in 1..9) {
            println("$num * $i = ${i * num}")
        }
        for (i in 1..9) {
            println("$plus * $i = ${i * plus}")
        }
    } else if (num == 2) {
        for (i in 1..9) {
            println("$num * $i = ${i * num}")
        }
        for (i in 1..9) {
            println("$plus * $i = ${i * plus}")
        }
    } else if (num == 9) {
        for (i in 1..9) {
            println("$minus * $i = ${i * minus}")
        }
        for (i in 1..9) {
            println("$num * $i = ${i * num}")
        }

    }
}



