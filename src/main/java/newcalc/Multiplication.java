package newcalc;

public class Multiplication extends Operation {

    public Multiplication(double x1, double x2) {
        super(x1, x2);
    }

    public double getResult(){
        return super.getX1() * super.getX2();
    }

    @Override
    public String toString() {
        return "Multiplication {Result = " + String.format("%.3f",getResult()) + "}";
    }
}
