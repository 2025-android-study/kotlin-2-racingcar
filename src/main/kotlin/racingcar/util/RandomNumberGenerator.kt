package racingcar.util

import camp.nextstep.edu.missionutils.Randoms
import racingcar.config.GameRule

object RandomNumberGenerator {
    fun generateRandomNum(): Int {
        return Randoms.pickNumberInRange(GameRule.RANDOM_NUM_RANGE.first, GameRule.RANDOM_NUM_RANGE.last)
    }
}