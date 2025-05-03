package basic2

data class S0046 (val name: String, val id: Int, val major: String){
    fun printInfo(){
        println("$name ($id), 전공: $major")
    }
}

val student1 = S0046("홍길동", 2023001, "컴퓨터공학")
val student2 = student1.copy(name = "김영희")

fun main (){
    student1.printInfo()
    student2.printInfo()
}