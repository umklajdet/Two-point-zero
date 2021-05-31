package readfile;

public class Word {
    public String wordValue;
    public int wordRepeat;

    public Word () {}

    public Word(String wordValue, int wordRepeat) {
        this.wordValue = wordValue;
        this.wordRepeat = wordRepeat;
    }

    public String getWordValue() {
        return wordValue;
    }

    public int getWordRepeat() {
        return wordRepeat;
    }

    public void setWordValue(String wordValue) {
        this.wordValue = wordValue;
    }

    public void setWordRepeat(int wordRepeat) {
        this.wordRepeat = wordRepeat;
    }
}
