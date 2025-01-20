package racingcar.constants

enum class ErrorConst(val message: String) {
    ERROR_LENGTH("자동차 이름은 5자 이하로 입력해주세요."),
    ERROR_CAR_NUM("2대 이상의 자동차를 입력해주세요."),
    ERROR_DUPLICATE("중복된 자동차 이름이 존재합니다."),
    ERROR_VALUE("올바른 자동차 이름을 입력해주세요."),

    ERROR_NUMBER("1 이상의 숫자를 입력해주세요.")
}