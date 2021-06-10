import jdk.internal.util.xml.impl.Input;
import newcalc.*;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.awt.im.InputContext;

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

    @Test(expected = DivisionToNullException.class)
    public void DivisionByZeroEx() throws DivisionToNullException {
        Operation op = new Division(5, 0);
        op.getResult();
    }

    @Rule
    public ExpectedException thrown = DivisionToNullException.none();
    @Test
    public void DivisionByZeroExMsg() throws DivisionToNullException {
        Operation op = new Division(5, 0);
        thrown.expect(DivisionToNullException.class);
        thrown.expectMessage("DivisionToNullException {Division to null is impossible}");
        op.getResult();
    }

    @Test
    public void SomeAdditionResult(){
        Operation op = new Addition(5, 6);
        Assert.assertTrue("Result should be 11", op.getResult() == 11);
    }
}
