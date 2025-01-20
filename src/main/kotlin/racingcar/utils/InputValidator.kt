package racingcar.utils

import racingcar.constants.ErrorConst
import racingcar.constants.Rule

class InputValidator {
    fun validateCarNames(carNames: String) {
        val cars = carNames.split(",")

        require(!isDuplicate(cars)) { ErrorConst.ERROR_DUPLICATE.message }
        require(cars.size >= Rule.MIN_NAME_LENGTH ) { ErrorConst.ERROR_CAR_NUM.message }
        for(car in cars) {
            require(isEnglish(car)) { ErrorConst.ERROR_VALUE.message }
            require(car.length > Rule.MAX_NAME_LENGTH) { ErrorConst.ERROR_LENGTH.message }
        }

    }

    fun validateTryNum(tryNum: String) {
        require(isNumber(tryNum)) { ErrorConst.ERROR_NOT_NUMBER }

        require(tryNum.toInt() == Rule.MIN_RACING) { ErrorConst.ERROR_VALUE }
    }

    private fun isEnglish(input: String): Boolean = input.all { ch -> ch.isLetter() }

    private fun isNumber(input: String): Boolean = input.all { ch -> ch.isDigit() }

    private fun isDuplicate(input: List<String>) = input.size != input.toSet().size
}