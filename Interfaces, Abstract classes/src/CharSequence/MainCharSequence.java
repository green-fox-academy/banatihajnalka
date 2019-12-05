package CharSequence;

public class MainCharSequence {
    public static void main(String[] args) {

        Gnirts gnirts = new Gnirts("example");

        System.out.println(gnirts.charAt(1));
        System.out.println(gnirts.length());
        System.out.println(gnirts.subSequence(1, 4));

        Shifter shifter = new Shifter("example", 2);

        System.out.println(shifter.charAt(0));
        System.out.println(shifter.length());
        System.out.println(shifter.subSequence(1, 4));

    }
}
