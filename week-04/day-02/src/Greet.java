public class Greet {
    public static void main(String[] args) {
        String al = "Green Fox";
        greetFunction(al);
        System.out.println(greetFunction(al));
    }

    private static String greetFunction(String al) {
        String greet = "Greetings dear, " + al;
        return greet;
    }
}
