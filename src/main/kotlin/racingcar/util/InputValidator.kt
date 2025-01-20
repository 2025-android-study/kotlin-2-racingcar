package racingcar.util

import racingcar.config.InputException
import racingcar.config.GameRule

object InputValidator {

    fun validateCarNamesInput(inputString: String) {
        val carNames = inputString.split(GameRule.INPUT_DELIMINATOR)
        carNames.forEach {
            require(it.length <= GameRule.NAME_LIMIT_LENGTH) { InputException.CAR_NAMES_LENGTH_EXCEPTION }
        }
    }
}