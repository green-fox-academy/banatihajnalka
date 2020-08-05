import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

  public static void main(String[] args) {

    List<List<Integer>> arrList = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12));
    System.out.println(diagonalDifference(arrList));
  }

  private static int diagonalDifference(List<List<Integer>> arrList) {

    int leftToRightSum = 0;
    int rightToLeftSum = 0;

    for (int i = 0; i < arrList.size(); i++) {
      leftToRightSum += arrList.get(i).get(i);
      rightToLeftSum += arrList.get(i).get(arrList.size() - i - 1);
    }
    return Math.abs(leftToRightSum - rightToLeftSum);


  }
}
