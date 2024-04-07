package exceptions;

public class NoCupsRemainingException extends Exception{
    public NoCupsRemainingException(String message) {
        super(message);
    }
}
