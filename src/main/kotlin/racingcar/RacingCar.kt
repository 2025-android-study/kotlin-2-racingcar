package racingcar

import racingcar.config.GameRule
import racingcar.model.CarMovementInfo
import racingcar.util.Converter
import racingcar.util.RandomNumberGenerator
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingCar {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun startRacing() {
        // 입력
        val carNames = inputView.readCarNames()
        val tryNum = inputView.readTryNumber()
        println()

        val carMovementInfos = Converter.getMoveInfosByCarNames(carNames)

        // 실행 결과
        outputView.printResultTitle()
        for (i: Int in 0 until tryNum) {
            racingOneStep(carMovementInfos) // 차수별 실행 결과
        }
        outputView.printWinner(carMovementInfos) // 최종 우승자 출력
    }

    private fun racingOneStep(carMovementInfos: List<CarMovementInfo>) {
        carMovementInfos.forEach { moveInfo ->
            val generatedNum = RandomNumberGenerator.generateRandomNum() // 난수 생성
            // 전진 조건 체크
            if (GameRule.isSatisfyForwardCondition(generatedNum)) {
                moveInfo.moveCount++ // 자동차 이동 거리 증가
            }
        }
        outputView.printEachCarMovementInfo(carMovementInfos) // 결과 출력
    }
}