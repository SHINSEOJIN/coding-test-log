package step0

fun main(){
    for(i in 1..100){
        if(i % 3 == 0 && i % 5 == 0){
            println(i)
        }
    }
}