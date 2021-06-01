package newcalc;

public class DivisionToNullException extends Exception {
    public DivisionToNullException() {
    }

    @Override
    public String toString() {
        return "DivisionToNullException {Division to null is impossible}";
    }
}
