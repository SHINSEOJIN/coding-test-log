package basic2

fun main(){
    println("5개의 숫자를 입력해주세요")
    val input = readLine()!!
        .split(Regex("[\\s,]+"))
        .mapNotNull { it.toIntOrNull() }

    if(input.size == 5){
        val max = input.maxOrNull()
        println("가장 큰 숫자는 $max 입니다.")
    }else{
        println("잘못된 입력입니다. 총 5개의 숫자를 입력해주세요.")
    }
}