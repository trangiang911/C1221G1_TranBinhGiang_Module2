package luyen_tap_de_4.utils;

public class NotFoundBankAccountException extends Exception {
    public NotFoundBankAccountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
