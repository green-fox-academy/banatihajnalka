import java.util.ArrayList;

public class Sum {

    public int sumArrayList(ArrayList<Integer> numbersList) throws Exception {
        if (numbersList == null) {
            throw new Exception("List not exists");
        }
        if (numbersList.size() == 0)  {
            System.out.println("empty list");
            return 0;
        }
        if (numbersList.contains(null)) {
            System.out.println("list contains null as an element");
            return 0;
        }
        if (numbersList.size() == 1) {
            System.out.println("only one element");
        }
        int sum = 0;
        for (int i : numbersList) {
            sum += i;
        }
        return sum;
    }
}
