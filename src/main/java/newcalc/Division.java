package newcalc;

public class Division extends Operation {

    public Division(double x1, double x2) {
        super(x1, x2);
    }

    public double getResult() throws DivisionToNullException{
        if (super.getX2() != 0)
            return super.getX1() / super.getX2();
        else
            throw new DivisionToNullException();
    }

    @Override
    public String toString() {
        try {
            return "Division {Result = " + String.format("%.3f",getResult()) + "}";
        } catch (DivisionToNullException e) {
            System.out.println("You can not divide to null");
            e.printStackTrace();
            return "";
        }
    }
}
