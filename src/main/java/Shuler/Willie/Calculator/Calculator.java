package Shuler.Willie.Calculator;

/**
 * Created by willieshuler on 9/30/16.
 */
public class Calculator {

    public static int add(int a, int b){return a+b;}

    public static int subtract(int a, int b){return a-b;}

    public static int multiply(int a, int b){return a*b;}

    public static int divide(int a, int b) throws DivisionByZeroException{
        if(b == 0){throw new DivisionByZeroException("Denominator is 0");}
        else {return a/b;}
    }

    public static double sqRoot(double a) throws ComplexNumberException {
        if(a < 0){throw new ComplexNumberException("Invalid");}
        else {return Math.sqrt(a);}
    }
}
