package readfile;

import java.io.FileReader;
import java.util.*;

public class ReadFileMain {
    public static void main(String[] args) throws Exception {
        List<Word> words = new ArrayList<>();
        FileReader read = new FileReader("F:\\projects\\Two-point-zero\\src\\main\\java\\readfile\\testFile.txt");
        Scanner scan = new Scanner(read);
        //StringBuilder buffer = new StringBuilder();
        int i = 0;
        while (scan.hasNext()){
            words.add(new Word());
            words.get(i).setWordValue(scan.next());
            i++;
        }
        read.close();
        scan.close();

        // сортировка слов из файла и вывод их
        List<Word> sortedWords = new ArrayList<>(words);
        sortedWords.sort(Comparator.comparing(Word::getWordValue));
        System.out.println("Sorted words:");
        for (Word word : sortedWords) {
            System.out.println(word.getWordValue());
        }

        // подсчет повторений, присваиваем значение соответствующей переменной объекта
        int counter = 1;
        i = 0;
        while(i < sortedWords.size()){
            for (int j = i+1; j < sortedWords.size(); j++){
                if (sortedWords.get(i).getWordValue().equals(sortedWords.get(j).getWordValue())) {
                    counter++;
                    if (j == words.size()-1) {
                        sortedWords.get(i).setWordRepeat(counter);
                        i = words.size();
                    }
                }
                else {
                    sortedWords.get(i).setWordRepeat(counter);
                    i = j;
                    counter = 1;
                }
            }
            if (i == words.size()-1){
                sortedWords.get(i).setWordRepeat(counter);
                break;
            }
        }

        // удаление повторений
        for (i = 0; i < sortedWords.size(); i++) {
            if(sortedWords.get(i).getWordRepeat() == 0){
                sortedWords.remove(i);
                i--;
            }
        }

        int max = 1;
        // вывод статистики по каждому слову
        System.out.println("----------------Words repetition statistics----------------");
        for (Word word : sortedWords) {
            System.out.printf("%s - %d%n", word.getWordValue(), word.getWordRepeat());
            if (word.getWordRepeat() > max)
                max = word.getWordRepeat();
        }
        // вывод слов с максимальным кол-вом повторений
        System.out.printf("Most repeated (%d times):%n", max);
        for (Word word : sortedWords)
            if(word.getWordRepeat() == max)
                System.out.printf("%s%n", word.getWordValue());
    }
}
