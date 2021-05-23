import java.util.Scanner;

/**
 * @author Pavel Fedorov
 * @see #getResult(double, double, char)
 */

public class Calc {
    public static void main(String[] args) {
        double n1, n2, result;
        String oper;
        Scanner scNum = new Scanner(System.in);
        Scanner scOper = new Scanner(System.in);
        System.out.println("Это калькулятор");
        System.out.println("Enter first number:");
        n1 = scNum.nextDouble();
        System.out.println("Enter second number:");
        n2 = scNum.nextDouble();
        System.out.println("Select operation: +, -, *, /");
        oper = scOper.nextLine();
        //System.out.printf("%f, %f, %s", n1, n2, oper);
        scNum.close();
        scOper.close();
        result = getResult(n1, n2, oper.trim().charAt(0));
        System.out.printf("%.4f %s %.4f = %.4f%n", n1, oper.trim(), n2, result);
    }

    /**
     * @param x1 input number 1
     * @param x2 input number 2
     * @param ch selected operation
     * @return result
     */
    public double getResult(double x1, double x2, char ch){
        double res = 0;
        switch (ch) {
            case '+':
                res = x1 + x2;
                break;
            case '-':
                res = x1 - x2;
                break;
            case '*':
                res = x1 * x2;
                break;
            case '/':
                res = x1 / x2;
                break;
        }
        return res;
    }
}