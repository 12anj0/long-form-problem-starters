package test;

import exceptions.NotEnoughBeansException;
import exceptions.TooManyBeansException;
import exceptions.WaterException;
import model.CoffeeMaker;
import org.junit.Before;
import org.junit.Test;


public class CoffeeMakerTest {

    @Before
    public void setUp(){
        // TODO: instantiate your test objects here
        CoffeeMaker cm = new CoffeeMaker();
    }

    @Test
    public void testTemplate(){
        // TODO: write some more tests
        // This is a template for unit tests
        CoffeeMaker cm = new CoffeeMaker();
        try {
            cm.brew(-1 , 5);
            System.out.println("this will not print");
        } catch (NotEnoughBeansException e) {
            System.out.println("the exception will be caught");
            e.getMessage();
        } catch (WaterException e) {
            throw new RuntimeException(e);
        } catch (TooManyBeansException e) {
            throw new RuntimeException(e);
        }
    }


}
