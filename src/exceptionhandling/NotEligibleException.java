package exceptionhandling;

public class NotEligibleException extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NotEligibleException(String message) {
        this.message = message;
    }
}
