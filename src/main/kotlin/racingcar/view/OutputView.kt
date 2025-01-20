package racingcar.view

import racingcar.model.CarMovementInfo

class OutputView {
    fun printResultTitle() {
        println(RESULT_TITLE)
    }

    fun printEachCarMovementInfo(movementInfos: List<CarMovementInfo>) {
        movementInfos.forEach { movementInfo ->
            println(String.format(MOVEMENT_RESULT, movementInfo.carName, MOVEMENT_SHOW.repeat(movementInfo.moveCount)))
        }
        println()
    }

    companion object {
        private const val RESULT_TITLE = "실행 결과"
        private const val MOVEMENT_SHOW = "-" // 이동거리 표시 수단
        private const val MOVEMENT_RESULT = "%s : %s" // {자동차 이름} : {이동 거리}
    }
}