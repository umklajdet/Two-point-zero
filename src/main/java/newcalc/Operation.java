package newcalc;

import java.util.Scanner;

public abstract class Operation {
    private double x1, x2;

    public Operation(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public static double getNumberForOperation(){
        Scanner sc = new Scanner (System.in);
        while (!sc.hasNextDouble()){
            System.out.println("Not a number. Try again");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public static char getOperationSymbol(){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        while (!(str.contains("+") ^ str.contains("-") ^ str.contains("*") ^ str.contains("/"))){
            System.out.println("Can not recognize the operation. Try again");
            str = sc.nextLine();
        }
        return str.trim().charAt(0);
    }
}
