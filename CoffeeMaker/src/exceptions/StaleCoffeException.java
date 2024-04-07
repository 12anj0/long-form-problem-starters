package exceptions;

public class StaleCoffeException extends Exception{
    private int time;

    public StaleCoffeException(String message, int time) {
        super(message);
        this.time = time;
    }
}
