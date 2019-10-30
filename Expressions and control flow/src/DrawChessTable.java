

public class DrawChessTable {
    public static void main(String[] args) {
        int row;

        for (row = 1; row < 5; row++) {
                if (row % 2 == 0) {
                    System.out.println("% % % % ");
                } else {
                    System.out.println(" % % % %");
                }
        }
    }

}