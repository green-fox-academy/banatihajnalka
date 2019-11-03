import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = listA;
        System.out.println(listB);

        listB.remove("Durian");
        System.out.println(listB);

        listA.add(4, "KiwiFruit");
        System.out.println(listA);

        int size1 = listA.size();
        int size2 = listB.size();
        if (size1 == size2) {
            System.out.println("The size is equal.");
        } else {
            System.out.println("They are not equal.");
        }

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement
        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listA.get(2));


   //     String[] values = {"Passion Fruit", "Pomelo"};
   //     Collections.addAll(listB, values);
   //     System.out.println(listB);

    }
}
