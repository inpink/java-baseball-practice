package baseball.messages;

public enum InputMessages {

    START_INPUT("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBERS("숫자를 입력해주세요 : "),
    INPUT_REGAME("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String message;

    InputMessages(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}