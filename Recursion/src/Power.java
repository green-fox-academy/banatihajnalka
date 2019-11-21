public class Power {
    public static void main(String[] args) {
//        Given base and n that are both 1 or more,
//        compute recursively (no loops) the value of base to the n power,
//        so powerN(3, 2) is 9 (3 squared).

        int result = powerRecursively(3,2);
        System.out.println(result);
    }

    private static int powerRecursively(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return base * powerRecursively(base, n - 1);
    }
}
