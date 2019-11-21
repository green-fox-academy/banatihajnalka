public class NumberAdder {
//    Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    public static void main(String[] args) {
        int result = addNumberWithRecursion(6);
        System.out.println(result);
    }

    private static int addNumberWithRecursion(int i) {
        if (i == 1) {
            return 1;
        }
        return i + addNumberWithRecursion(i-1);
    }
}
