package racingcar.config

enum class InputException(val errorMessage: String) {
    // 자동차 이름 입력
    CAR_NAMES_LENGTH_EXCEPTION("자동차 이름은 ${GameRule.NAME_LIMIT_LENGTH} 이하여야 합니다."),
    // 시도 횟수 입력
    TRY_NUM_NOT_INT_EXCEPTION("시도 횟수는 정수로 입력해야 합니다.")
}