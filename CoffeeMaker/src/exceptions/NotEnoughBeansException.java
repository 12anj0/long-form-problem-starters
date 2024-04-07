package exceptions;

public class NotEnoughBeansException extends BeansAmountException{
    public NotEnoughBeansException(double beans, String message) {
        super(beans, message);
    }
}
