package racingcar.view

import racingcar.constants.OutputConst
import racingcar.model.Car

class OutputView {

    fun printResultTitle() {
        println(OutputConst.RESULT.message)
    }

    fun printRacingResults(cars: List<Car>) {
        cars.forEach { car ->
            print(OutputConst.RECENT_DISTANCE.message.format(car))
            for(i in 0..car.distance) print(OutputConst.DISTANCE_UNIT.message)
            println()
        }
        println()
    }

    fun printWinner(cars: List<Car>) {
        print(OutputConst.WINNER.message.format(cars))
    }
}