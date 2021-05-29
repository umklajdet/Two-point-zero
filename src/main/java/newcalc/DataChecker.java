package newcalc;

import java.util.Scanner;

public class DataChecker {
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
