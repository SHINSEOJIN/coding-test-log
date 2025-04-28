package step0_1

import java.util.*

var fix = 0

fun main() {
    try {
        do {
            start()
            game()
        } while (askRestart())
        println("게임을 종료합니다.")
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}

fun start() {
    println("숫자게임을 시작합니다.\n기본 제공 횟수는 5회입니다.\n수정은 u 시작은 s를 눌러주세요.")
    val answer = readLine()!!.toString()
    if (answer.isBlank()) {
        println("잘못된 입력입니다.\n수정은 u 시작은 s를 눌러주세요.")
    } else if (answer.uppercase() == "S") {
        fix = 5
    } else if (answer.uppercase() == "U") {
        while (true) {
            println("수정할 제한 횟수를 입력해주세요. ex)3")
            try {
                fix = readLine()!!.toInt()
                if (fix < 1) {
                    println("제한 횟수는 0보다 커야만 합니다.")
                } else {
                    break
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }
}

fun game() {
    var cnt = 0
    println("1부터 100 사이 랜덤 숫자 하나 뽑을게요!")
    val quiz = (1..100).random().toInt()
    //    println("뽑은 숫자: $quiz") //테스트용
    for (i in 1..fix) {
        println("${i}번째 시도: 숫자를 입력하세요!")

        var gameanswer = try {
            readLine()!!.toInt()
        }catch (e: NumberFormatException){
            println("숫자만입력해주세요!")
            continue
        }

        cnt++

        if (gameanswer != quiz) {
            if (gameanswer < quiz) {
                println("숫자를 더 올리세요!")
            } else if (gameanswer > quiz)
                println("숫자를 더 내리세요!")
        } else if (gameanswer == quiz) {
            println("정답을 맞추셨습니다.")
            break
        }
    }
    if (cnt == fix) {
        println(
            "주어진 기회안에 숫자를 맞추지 못했어요\n" +
                    "정답은 $quiz 였습니다."
        )

    }
}


fun askRestart(): Boolean {
    println("게임을 다시 시작하시겠습니까? (Y/N)")
    val answer = readLine()!!.uppercase()
    return answer == "Y"
}