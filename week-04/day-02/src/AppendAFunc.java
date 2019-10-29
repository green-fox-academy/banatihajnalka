public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendAFunction(typo);
        System.out.println(appendAFunction(typo));
    }
    private static String appendAFunction(String typo) {
        String appendA = typo + "a";
        return appendA;

    }
}
