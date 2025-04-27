package step0

//사용자에게 숫자를 입력받아
//소수만(나머지가 1과 본인뿐인 숫자) 출력

fun main() {
    try {
        println("숫자를 입력하세요.")
        var number = readLine()!!.toInt()
        for (n in 2..number) {
            var isPrime = true
            for (m in 2..n - 1) {
                if (n % m == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println(n)
            }
        }
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}
