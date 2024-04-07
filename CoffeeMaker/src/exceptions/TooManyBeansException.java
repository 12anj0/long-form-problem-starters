package exceptions;

public class TooManyBeansException extends BeansAmountException{
    public TooManyBeansException(double beans, String message) {
        super(beans, message);
    }
}
