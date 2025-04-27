package step0

fun main(){
    println("숫자를 입력하세요.") //안내메세지
    val number = readLine()!!.toInt() //사용자입력 -> 숫자변환

    if (number % 2 == 0){
        println("짝수입니다.") //짝수판별
    }else{
        println("홀수입니다.") //홀수판별
    }
}