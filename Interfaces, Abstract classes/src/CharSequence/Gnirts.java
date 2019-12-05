package CharSequence;

public class Gnirts implements CharSequence {
    private String word;

    public Gnirts(String word) {
        this.word = word;
    }

    private int formEnd(int i) {
        return word.length() -1 - i;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int i) {
        if ((i < 0 || i >= word.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return word.charAt(formEnd(i));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > word.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder subsequenceWord = new StringBuilder(word.subSequence(formEnd(end), formEnd(start)));
        return subsequenceWord.reverse();
    }
}
