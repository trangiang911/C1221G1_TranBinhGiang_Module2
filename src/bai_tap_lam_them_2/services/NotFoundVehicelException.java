package bai_tap_lam_them_2.services;

public class NotFoundVehicelException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public NotFoundVehicelException(String message) {
        super(message);
    }
}
