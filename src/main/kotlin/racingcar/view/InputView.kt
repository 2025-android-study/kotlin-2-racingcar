package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.config.GameRule
import racingcar.util.InputConverter
import racingcar.util.InputValidator

class InputView {
    private val validator = InputValidator

    fun readCarNames(): List<String> {
        println(INPUT_CAR_NAMES)
        val input = Console.readLine()
        validator.validateCarNamesInput(input)
        return InputConverter.getCarsNames(input)
    }

    companion object {
        private const val INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(${GameRule.INPUT_DELIMINATOR}) 기준으로 구분)"
    }
}