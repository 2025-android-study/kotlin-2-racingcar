package racingcar.util

import racingcar.config.InputException
import racingcar.config.GameRule

object InputValidator {

    fun validateCarNamesInput(inputString: String) {
        val carNames = inputString.split(GameRule.INPUT_DELIMINATOR)
        carNames.forEach {
            require(it.length <= GameRule.NAME_LIMIT_LENGTH) { InputException.CAR_NAMES_LENGTH_EXCEPTION.errorMessage }
        }
    }

    fun validateTryNumInput(inputString: String) {
        try {
            inputString.toInt()
        } catch (e: Exception) {
            throw IllegalArgumentException(InputException.TRY_NUM_NOT_INT_EXCEPTION.errorMessage)
        }
    }
}