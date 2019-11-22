// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
// The output should be: "Noooooo"
// Do this again with a different solution using different list methods!

import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 7, 3, 4, 5));
        System.out.println(containsSeven(arrayList));

        }

    private static  List<Integer> containsSeven(ArrayList<Integer> arrayList) {
        boolean result = arrayList.contains(7);
        if (result) {
            System.out.println("Horray");
        } else {
            System.out.println("Nooooo");
        } return arrayList;



    }
}
