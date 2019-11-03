import java.util.Arrays;

public class Doubling {
    public static void main(String[] args) {
        int baseNum = 123;
        doublingFunction(baseNum);
        System.out.println(doublingFunction(baseNum));
    }

    private static int doublingFunction(int baseNum) {
        int doubled = baseNum * 2;
        return doubled;

    }

}

