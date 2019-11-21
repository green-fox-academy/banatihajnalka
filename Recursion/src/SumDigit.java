public class SumDigit {
//  Given a non-negative integer n, return the sum of its digits recursively (without loops).
    public static void main(String[] args) {
        int result = sumDigit(125);
        System.out.println(result);
    }
    private static int sumDigit(int i) {
        if (i == 0) {
            return 0;
        }
        return sumDigit(i /10) + i % 10;
    }
}
