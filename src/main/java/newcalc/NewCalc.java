package newcalc;

public class NewCalc {
    public static void main(String[] args) {
        double x1, x2;
        System.out.println("Enter first number:");
        x1 = DataChecker.getNumberForOperation();
        System.out.println("Enter second number:");
        x2 = DataChecker.getNumberForOperation();
        System.out.println("Select operation: +, -, *, /");
        char operationSymbol = DataChecker.getOperationSymbol();
        getOperationResult(x1, x2, operationSymbol);
    }

    public static void getOperationResult(double x1, double x2, char operationSymbol){
        Operation operation;
        switch (operationSymbol) {
            case '+':
                operation = new Addition(x1, x2);
                System.out.println(operation.toString());
                break;
            case '-':
                operation = new Subtraction(x1, x2);
                System.out.println(operation.toString());
                break;
            case '*':
                operation = new Multiplication(x1, x2);
                System.out.println(operation.toString());
                break;
            case '/':
                operation = new Division(x1, x2);
                System.out.println(operation.toString());
                break;
            default:
                System.out.println("Can not recognize the operation");
                break;
        }
    }
}
