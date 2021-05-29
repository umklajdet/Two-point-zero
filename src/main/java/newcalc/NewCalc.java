package newcalc;

import java.util.Scanner;

public class NewCalc {
    public static void main(String[] args) {
        double x1, x2;
        System.out.println("Enter first number:");
        x1 = getNumberForOperation();
        System.out.println("Enter second number:");
        x2 = getNumberForOperation();
        System.out.println("Select operation: +, -, *, /");
        char operationSymbol = getOperationSymbol();
        getOperationResult(x1, x2, operationSymbol);
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
        return str.trim().charAt(0);
    }

    public static void getOperationResult(double x1, double x2, char operationSymbol){
        switch (operationSymbol) {
            case '+':
                Addition operation1 = new Addition(x1, x2);
                System.out.println(operation1.toString());
                break;
            case '-':
                Subtraction operation2 = new Subtraction(x1, x2);
                System.out.println(operation2.toString());
                break;
            case '*':
                Multiplication operation3 = new Multiplication(x1, x2);
                System.out.println(operation3.toString());
                break;
            case '/':
                Division operation4 = new Division(x1, x2);
                System.out.println(operation4.toString());
                break;
            default:
                System.out.println("Can not recognize the operation");
                break;
        }
    }
}
