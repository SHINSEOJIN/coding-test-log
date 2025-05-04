package basic2

data class Student(val name: String, val id : Int, val major: String) {
    fun printInfo() {
        println("$name ($id), 전공: $major")
    }
}

fun main() {
    val students = listOf(
        Student("홍길동", 2023001, "컴퓨터공학"),
        Student("김영희", 2023002, "디자인학과"),
        Student("이철수", 2023003, "경영학과")
        )

    for(student in students) {
        student.printInfo()
    }
}