package racingcar

import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms

private var carList = listOf<String>()
private var carResult = mutableMapOf<String, String>()

fun main() {
    println(Text.GAME_START.msg)

    getCarList()

    println(Text.TRY_NUM.msg)

    var tryNum = Console.readLine()
    isDigit(tryNum)

    println(Text.RESULT_TITLE.msg)

    for (i in 0 until tryNum.toInt()) {
        carResult.forEach {
            goOrStop(it.key)
            println(String.format(Text.CAR_RESULT.msg, it.key, it.value))
        }
        println()
    }

    getFinalResult()
}

private fun getCarList() {
    carList = Console.readLine().split(",")
    carList.forEach {
        require(it.length < 6) { print(Error.CAR_NAME_ERROR.msg) }
        carResult.put(it, "")
    }
}

private fun isDigit(text: String) {
    try {
        text.toInt()
    } catch (e: IllegalArgumentException) {
        throw IllegalArgumentException(Error.DIGIT_ERROR.msg)
    }
}

private fun goOrStop(carName: String) {
    if (Randoms.pickNumberInRange(0, 9) > 3) {
        carResult.put(carName, carResult.get(carName)!! + "-")
    }
}

private fun getFinalResult() {
    print(Text.FINAL_RESULT.msg)

    var result = carResult.toList().sortedByDescending { it.second }
    var max = result[0].second

    print(result[0].first)

    for (i in 1 until result.size) {
        if (result[i].second == max) print(", ${result[i].first}")
        else break
    }
}