package racingcar

enum class Text(val msg: String) {
    GAME_START("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분"),
    TRY_NUM("시도할 횟수는 몇 회인가요?"),
    RESULT_TITLE("\n실행 결과"),
    CAR_RESULT("%s : %s"),
    FINAL_RESULT("최종 우승자 : ")
}

enum class Error(val msg: String) {
    CAR_NAME_ERROR("자동차 이름은 5자 이하여야 합니다."),
    DIGIT_ERROR("입력값은 숫자여야 합니다.")
}