package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.config.GameRule
import racingcar.util.Converter
import racingcar.util.InputValidator

class InputView {
    private val validator = InputValidator

    fun readCarNames(): List<String> {
        println(INPUT_CAR_NAMES)
        val input = Console.readLine()
        validator.validateCarNamesInput(input)
        return Converter.getCarsNames(input)
    }

    fun readTryNumber(): Int {
        println(INPUT_TRY_NUM)
        val input = Console.readLine()
        validator.validateTryNumInput(input)
        return input.toInt()
    }

    companion object {
        private const val INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(${GameRule.INPUT_DELIMINATOR}) 기준으로 구분)"
        private const val INPUT_TRY_NUM = "시도할 횟수는 몇 회인가요?"
    }
}