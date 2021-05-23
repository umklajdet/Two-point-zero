import java.util.Scanner;

/**
 * @author Pavel Fedorov
 */

public class SearchLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.println("Выберите дальнейшее действие: 1 - поиск самого длинного слова, 2 - калькулятор");
        int selected = sc.nextInt();
        if (selected == 1) {
            int size, maxLen = 0, i, indexMax = 0;
            System.out.println("Введите размер массива:");
            size = sc.nextInt();
            String[] words = new String[size];
            System.out.println("Введите слова в массив");
            for (i = 0; i < size; i++)
                words[i] = scStr.nextLine();
            for (i = 0; i < size; i++){
                if (words[i].length() > maxLen){
                   maxLen = words[i].length();
                   indexMax = i;
                }
            }
            System.out.printf("Самое длинное слово: %s (%d букв)%n", words[indexMax], maxLen);
        }
        if (selected == 2) {
            System.out.println("Введите первое число:");
            double n1 = sc.nextDouble();
            System.out.println("Введите второе число:");
            double n2 = sc.nextDouble();
            System.out.println("Введите символ операции: +, -, *, /");
            String oper = scStr.nextLine();
            double r = Calc.getResult(n1, n2, oper.trim().charAt(0));
            System.out.printf("Результат:%n%f", r);
        }
        sc.close();
        scStr.close();
    }
}
