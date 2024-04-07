package main;

import model.CoffeeMaker;

public class Main {

    public static void main(String[] args) {
        // TODO: complete the implementation of Main
        CoffeeMaker cm = new CoffeeMaker();
        try {
            cm.brew(2 , 5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            cm.pourCoffee();
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            cm.getCupsRemaining();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}