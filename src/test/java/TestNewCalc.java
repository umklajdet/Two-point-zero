import jdk.internal.util.xml.impl.Input;
import newcalc.*;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.awt.im.InputContext;
import java.util.regex.Matcher;

public class TestNewCalc {

    @Test
    public void MultiplyToZeroShouldBeZero1(){
        Operation op = new Multiplication(0, 5);
        Assert.assertTrue ("Multiplication to zero should be zero", op.getResult() == 0);
    }

    @Test
    public void MultiplyToZeroShouldBeZero2(){
        Operation op = new Multiplication(5, 0);
        Assert.assertTrue ("Multiplication to zero should be zero", op.getResult() == 0);
    }

    @Test
    public void AdditionBorderTest() {
        Operation op = new Addition(4.9999999999, 10);
        Assert.assertFalse("Result should be 14.9999999999", op.getResult() == 15);
    }

    @Test
    public void SomeAdditionResult(){
        Operation op = new Addition(5, 6);
        Assert.assertEquals("Result should be 11", 11, op.getResult(), 0.0);
    }

    @Test
    public void SubtractionTest1(){
        Operation op = new Subtraction(100.5, 0.5);
        Assert.assertTrue("Result should be 100", op.getResult() == 100);
    }

    @Test
    public void SubtractionTest2(){
        Operation op = new Subtraction(1000.0000001, 0.0000001);
        Assert.assertTrue("Result should be 1000", op.getResult() == 1000);
    }

    @Test
    public void DivisionTest1(){
        Operation op = new Division(10, 2.5);
        Assert.assertEquals("Result should be 4", 4, op.getResult(), 0.0);
    }

    @Test
    public void DivisionZeroTest() {
        Operation op = new Division(0, 5);
        Assert.assertEquals(0, op.getResult(), 0.0);
    }

//    @Test(expected = ArithmeticException.class)
//    public void DivisionByZeroEx() throws ArithmeticException {
//        Operation op = new Division(5, 0);
//        op.getResult();*/
//    }

    /*@Rule
    public ExpectedException thrown = DivisionToNullException();
    @Test
    public void DivisionByZeroExMsg() throws DivisionToNullException {
        Operation op = new Division(5, 0);
        thrown.expect(DivisionToNullException.class);
        thrown.expectMessage("DivisionToNullException {Division to null is impossible}");
        op.getResult();
    }*/

}
