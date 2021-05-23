import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Pavel Fedorov
 */

public class SearchLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int size, maxLen = 0, i, indexMax = 0;
        System.out.println("Введите размер массива:");
        size = sc.nextInt();
        String[] words = new String[size];
        System.out.println("Введите слова в массив");
        for (i = 0; i < size; i++)
            words[i] = scStr.nextLine();
        System.out.println(Arrays.deepToString(words));
        for (i = 0; i < size; i++){
            if (words[i].length() > maxLen){
               maxLen = words[i].length();
               indexMax = i;
            }
        }
        System.out.printf("Самое длинное слово: %s (%d букв)%n", words[indexMax], maxLen);
        sc.close();
        scStr.close();
    }
}
