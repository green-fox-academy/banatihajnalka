package CharSequence;

public class Gnirts2 implements CharSequence {
    private String word;

    public Gnirts2(String string) {
        this.word = string;
    }

    public String gnirts() {
        String reversed = "";
        for (int i = 0; i < word.length(); i++) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

    public String getWord() {
        return gnirts();
    }
    @Override
    public int length() {
        return gnirts().length();
    }

    @Override
    public char charAt(int index) {
        return gnirts().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return gnirts().subSequence(start, end);
    }
}
