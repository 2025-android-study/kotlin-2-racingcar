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

    fun printWinner(movementInfos: List<CarMovementInfo>) {
        val winnerNamesString = getWinnerNames(movementInfos).joinToString(WINNER_DELIMINATOR)
        println(String.format(FINAL_WINNER, winnerNamesString))
    }

    private fun getWinnerNames(movementInfos: List<CarMovementInfo>): List<String> {
        var highestMovementNum: Int = -1
        val highestCarNames: MutableList<String> = mutableListOf()

        movementInfos.forEach {
            if (it.moveCount == highestMovementNum) {
                highestCarNames.add(it.carName)
            } else if (it.moveCount > highestMovementNum) {
                highestCarNames.clear()
                highestMovementNum = it.moveCount
                highestCarNames.add(it.carName)
            }
        }
        return highestCarNames
    }

    companion object {
        private const val RESULT_TITLE = "실행 결과"
        private const val MOVEMENT_SHOW = "-" // 이동거리 표시 수단
        private const val MOVEMENT_RESULT = "%s : %s" // {자동차 이름} : {이동 거리}
        private const val WINNER_DELIMINATOR = "," // 우승자 구분
        private const val FINAL_WINNER = "최종 우승자 : %s"
    }
}