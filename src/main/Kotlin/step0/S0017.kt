package step0

fun main(){
    var sum = 0
    println("숫자를 입력하세요.")
    var num = readLine()!!.toInt()
    for(i in 1..num){
        sum += i
    }
    println(sum)
}