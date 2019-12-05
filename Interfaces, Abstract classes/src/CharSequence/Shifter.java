package CharSequence;

public class Shifter implements CharSequence{
    private String word;
    private int shift;

    public Shifter(String word, int shift) {
        this.word = word;
        this.shift = shift;
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
        return word.charAt(i + 2);
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
        return word.subSequence(start, end);
    }
}

