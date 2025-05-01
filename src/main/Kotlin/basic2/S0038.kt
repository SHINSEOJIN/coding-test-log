package basic2

fun main() {
    val numbers = arrayOf(10,13,22,7,8)
    for(num in numbers){
        if(num % 2 ==0){
            println("짝수는 $num 입니다.")
        }
    }
}