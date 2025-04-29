package basic1

fun main(){
    for(i in 1..100){
        if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
            println(i)
        }else{
            println("조건에 맞는 숫자가 없습니다.")
            break
        }
    }
}