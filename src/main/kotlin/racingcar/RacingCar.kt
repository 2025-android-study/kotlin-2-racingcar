package racingcar

import racingcar.view.InputView

class RacingCar {
    private val inputView = InputView()

    fun startRacing() {
        val carNames = inputView.readCarNames()
        val tryNum = inputView.readTryNumber()
    }
}