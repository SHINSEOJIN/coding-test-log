package basic1

fun main() {
    for(i in 1..30){
        if(i % 2 == 0 && i % 3 == 0){
            println(i)
        }
    }
}