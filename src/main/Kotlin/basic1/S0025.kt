package basic1

fun main() {
    try {
        println("2 ~ 9 까지의 숫자를 입력하세요.")
        var num = readLine()!!.toInt()

        if (num in 3..8) {
            printGugudan(num - 1)
            printGugudan(num)
            printGugudan(num + 1)
        } else if (num == 2) {
            printGugudan(num)
            printGugudan(num + 1)
        } else if (num == 9) {
            printGugudan(num - 1)
            printGugudan(num)
        } else {
            println("잘못된 입력입니다.\n2 ~ 9 까지의 숫자를 입력해 주세요.")
        }
    } catch (e: Exception){
        println("잘못된 입력입니다.")
    }
}

fun printGugudan(n: Int) {
    println("----${n} 단----")
    for (i in 1..9) {
        println("$n * $i = ${n * i}")
    }
}


