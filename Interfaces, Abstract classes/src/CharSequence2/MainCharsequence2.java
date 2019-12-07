package CharSequence2;

public class MainCharsequence2 {
    public static void main(String[] args) {

        Gnirts2 word = new Gnirts2("example");
        System.out.println(word.getWord());
        System.out.println(word.charAt(0) + " " + word.length());
        System.out.println(word.subSequence(0, 3));

        Shifter2 otherWord = new Shifter2("example", 2);
        System.out.println(otherWord.charAt(0));
        System.out.println(otherWord.subSequence(0, 3));
    }
}
