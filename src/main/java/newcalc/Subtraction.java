package newcalc;

public class Subtraction extends Operation {

    public Subtraction(double x1, double x2) {
        super(x1, x2);
    }

    public double getResult(){
        return super.getX1() - super.getX2();
    }

    @Override
    public String toString() {
        return "Subtraction {Result = " + String.format("%.3f",getResult()) + "}";
    }
}
