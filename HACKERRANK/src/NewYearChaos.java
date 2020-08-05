//public class NewYearChaos {
//
//  public static void main(String[] args) {
//    int[] q = {2, 1, 5, 3, 4};
//    minimumBribes(q);
//  }
//
//  private static void minimumBribes(int[] q) {
//
//    int bribes = 0;
//
//    for (int i = 0; i < q.length -1; i++) {
//      if (q[i] - i -1  >=3) {
//        System.out.println("Too chaotic");
//        return;
//      }
//      if (q[i] > q[i + 1]) {
//        bribes++;
//      }
//    }
//    System.out.println(bribes);
//  }
//}
