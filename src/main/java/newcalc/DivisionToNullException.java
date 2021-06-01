package newcalc;

public class DivisionToNullException extends ArithmeticException {
    public DivisionToNullException() {

    }

    @Override
    public String toString() {
        return "DivisionToNullException {Division to null is impossible}";
    }
}
