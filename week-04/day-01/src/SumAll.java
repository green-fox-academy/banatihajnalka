public class SumAll {
    public static void main(String[] args) {
            int[] ai = {3, 4, 5, 6, 7};
            int sum = sumAll(ai);
            System.out.println(sum);
        }
    private static int sumAll(int[] ai) {
        int sum = 0;
        for (int i = 0; i < ai.length; i++) {
            sum += ai[i];
        }
        return sum;
    }
}

























