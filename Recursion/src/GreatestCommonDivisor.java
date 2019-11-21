public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int result = greatestCommonDivisorRec(100, 20);
        System.out.println(result);

    }

    private static int greatestCommonDivisorRec(int first, int second) {
        if (second == 0) {
            return first;
        }
        return greatestCommonDivisorRec(second, first % second);
    }
}
