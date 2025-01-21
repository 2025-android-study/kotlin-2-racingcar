package racingcar

import racingcar.constants.Rule
import racingcar.model.Car
import racingcar.utils.NumberPicker
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingController {
    private val input = InputView()
    private val output = OutputView()
    private val numPicker = NumberPicker()

    fun run() {
        val cars: List<Car> = input.getCars()
        val tryNum = input.getTryNum()

        output.printResultTitle()

        for(i in 0..tryNum) {
            playRacing(cars)
        }

        output.printWinner(getWinners(cars))
    }

    private fun playRacing(cars: List<Car>) {
        for(car in cars) {
            if(numPicker.pickNumber() >= Rule.GO_NUM) car.distance++
        }
        output.printRacingResults(cars)
    }

    private fun getWinners(cars: List<Car>): List<Car> {
        val winDistance = cars.maxOf { it.distance }
        return cars.filter { it.distance == winDistance}
    }
}