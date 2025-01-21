package racingcar.util

import racingcar.config.GameRule
import racingcar.model.CarMovementInfo

object Converter {
    fun getCarsNames(str: String): List<String> {
        return str.split(GameRule.INPUT_DELIMINATOR)
    }

    fun getMoveInfosByCarNames(carNames: List<String>): List<CarMovementInfo> {
        val carMovementInfos: MutableList<CarMovementInfo> = mutableListOf()
        carNames.forEach { name ->
            carMovementInfos.add(CarMovementInfo(name))
        }
        return carMovementInfos
    }
}