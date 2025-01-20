package racingcar.util

import racingcar.config.GameRule

object InputConverter {
    fun getCarsNames(str: String): List<String> {
        return str.split(GameRule.INPUT_DELIMINATOR)
    }
}