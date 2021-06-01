package newcalc;

import static java.lang.Double.NaN;

public class Division extends Operation {

    public Division(double x1, double x2) {
        super(x1, x2);
    }

    public double getResult() throws DivisionToNullException {
        try {
            if (super.getX2() != 0)
                return super.getX1() / super.getX2();
            else
                throw new DivisionToNullException();
        } catch (DivisionToNullException e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return NaN;
        }
    }

    @Override
    public String toString() {
        return "Division {Result = " + String.format("%.3f",getResult()) + "}";
    }
}
