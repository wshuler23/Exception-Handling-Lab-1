package Shuler.Willie.CalculatorTest;


import Shuler.Willie.Calculator.Calculator;
import Shuler.Willie.Calculator.ComplexNumberException;
import Shuler.Willie.Calculator.DivisionByZeroException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by willieshuler on 9/30/16.
 */
public class CalculatorTest {

    @Test
    public void addTest() {
        int a = 3;
        int b = 4;

        int expectedValue = 7;
        int actualValue = Calculator.add(a, b);

        Assert.assertEquals("The answer should be 7", expectedValue, actualValue);
    }

    @Test
    public void subtractionTest() {
        int a = 5;
        int b = 3;

        int expectedValue = 2;
        int actualValue = Calculator.subtract(a, b);

        Assert.assertEquals("The answer should be 2", expectedValue, actualValue);
    }

    @Test
    public void multiplyTest() {
        int a = 3;
        int b = 4;

        int expectedValue = 12;
        int actualValue = Calculator.multiply(a, b);

        Assert.assertEquals("The answer should be 12", expectedValue, actualValue);
    }

    @Test
    public void divisonTest() {
        try {
            int expectedValue = 5;
            int actualValue =  Calculator.divide(25,5);
            Assert.assertTrue(expectedValue == actualValue);
        }
        catch (DivisionByZeroException e) {e.printStackTrace();}
    }

    @Test
    public void divisonZeroTest() {
        try {
            Calculator.divide(12, 0);
        } catch (DivisionByZeroException e) {
            Assert.assertTrue(e.getMessage().equals("Denominator is 0"));
        }
    }

    @Test
    public void sqRootTest() {
        try {
            double expectedValue = 5;
            double actualValue =  Calculator.sqRoot(25);
            Assert.assertTrue(expectedValue == actualValue);
        }
        catch (ComplexNumberException e) {e.printStackTrace();}
    }

    @Test
    public void sqRootComplexNumber(){
        try {
            Calculator.sqRoot(-1);
        } catch (ComplexNumberException e) {
            Assert.assertTrue(e.getMessage().equals("Invalid"));
        }
    }
}