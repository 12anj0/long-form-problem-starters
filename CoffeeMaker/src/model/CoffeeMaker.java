package model;

import exceptions.*;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {
    private int cupsRemaining;
    private int timeSinceLastBrew;

    public void setCupsRemaining(int cupsRemaining) {
        this.cupsRemaining = cupsRemaining;
    }

    public CoffeeMaker(){
        timeSinceLastBrew = 0;
        cupsRemaining = 0;
        // TODO: complete the implementation of this method
    }

    // getters
    public int getTimeSinceLastBrew() throws Exception {
        // TODO: complete the implementation of this method
        return timeSinceLastBrew;
    }
    public int getCupsRemaining()  throws Exception{
        // TODO: complete the implementation of this method
        return cupsRemaining;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining()  throws Exception{
        // TODO: complete the implementation of this method
        return cupsRemaining >0;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time)  throws Exception{
        // TODO: complete the implementation of this method
        this.timeSinceLastBrew = time;
    }

    //REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water) throws NotEnoughBeansException, WaterException, TooManyBeansException {
        if (water <= 14.75)
            throw new WaterException(water  ,"Not enough water");

        if (beans >= 2.4) {
            if (beans <= 2.6) {
                cupsRemaining = 20;
                timeSinceLastBrew = 0;
            } else {
                throw new TooManyBeansException(beans , "too many beans");
            }
        } else {
            throw new NotEnoughBeansException(beans , " not enough beans");
        }
    }

    ///REQUIRES: cups remaining > 0, time since last brew < 60
    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining
    public void pourCoffee()  throws Exception{
        // TODO: complete the implementation of this method
        if(!areCupsRemaining()){
            throw new NoCupsRemainingException("no cups reamaining");
        } else if (timeSinceLastBrew >= 60){
            throw new StaleCoffeException("stale state",timeSinceLastBrew);
        } else {
            cupsRemaining--;
        }
    }


}
