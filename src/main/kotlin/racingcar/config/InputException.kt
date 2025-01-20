package racingcar.config

enum class InputException(val errorMessage: String) {
    // 자동차 이름 입력
    CAR_NAMES_LENGTH_EXCEPTION("자동차 이름은 ${GameRule.NAME_LIMIT_LENGTH} 이하여야 합니다.")
}