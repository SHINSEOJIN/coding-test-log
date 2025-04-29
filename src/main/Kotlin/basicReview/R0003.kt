package basicReview

fun main() {
    println("2개의 숫자를 입력해주세요.")

    val input = readLine()!!.split(Regex("[\\s,]+"))

    if (input.size == 2) {
        val num1 = input[0].toIntOrNull()
        val num2 = input[1].toIntOrNull()
        if (num1 != null && num2 != null){
            println(num1 - num2)
        }else{
            println("잘못된 입력입니다.")
        }
    }else{
        println("2개의 숫자를 입력해야합니다.")
    }
}