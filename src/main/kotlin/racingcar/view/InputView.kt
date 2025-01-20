package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.constants.InputConst
import racingcar.model.Car
import racingcar.utils.InputValidator

class InputView {
    private val validator = InputValidator()

    fun getCars(): List<Car> {
        println(InputConst.CAR_NAME.message)
        val carNames = Console.readLine()

        validator.validateCarNames(carNames)

        return carNames.split(",").map { Car(name = it, distance = 0) }
    }

    fun getTryNum(): Int {
        println(InputConst.TRY_NUM.message)
        val tryNum = Console.readLine()

        validator.validateTryNum(tryNum)

        return tryNum.toInt()
    }
}