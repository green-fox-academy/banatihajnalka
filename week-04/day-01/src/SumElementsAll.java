public class SumElementsAll {
    public static void main(String[] args) {
        int[] r = {54, 23, 66, 12};
        int sum = sumArray(r);

        System.out.println(sum);

    }

    private static int sumArray (int[] r) {
        int sum = 0;
        for (int i = 0; i < r.length; i++) {
            sum += r[i];
        }
        return sum;

    }

}
