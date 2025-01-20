package racingcar.config

object GameRule {
    const val INPUT_DELIMINATOR = "," // 입력 구분자
    const val NAME_LIMIT_LENGTH = 5 // 자동차 이름 글자수 제한

    val RANDOM_NUM_RANGE: IntRange = 0..9
    private const val MOVEMENT_CRITERIA_NUMBER = 4 // 전진의 기준 숫자

    fun isSatisfyForwardCondition(generatedNum: Int): Boolean {
        return generatedNum >= MOVEMENT_CRITERIA_NUMBER // 생셩된 값이 4 이상이면 이동
    }
}