package basic2

fun main (){
    val numbers = arrayOf(3, 9, 12, 15, 20, 21, 4, 30)
    for(num in numbers){
        if(num % 3 == 0 && num > 11){
            print("$num ")
        }
    }
}