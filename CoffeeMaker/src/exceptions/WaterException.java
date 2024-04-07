package exceptions;

public class WaterException extends Exception{
    private double water;

    public WaterException(double water ,String message ) {
        super(message);
        this.water = water;
    }
}
