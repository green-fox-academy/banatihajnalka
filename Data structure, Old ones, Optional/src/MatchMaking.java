import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// Write a method that joins the two lists by matching one girl with one boy into a new list
// If someone has no pair, he/she should be the element of the list too
// Expected output: "Eve", "Joe", "Ashley", "Fred"...

public class MatchMaking {
    public static void main(String[] args) {
            ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
            ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

            HashMap<String, String> mappedList = new HashMap<>();
            System.out.println(makingMatches(girls, boys));
  //         System.out.println(makingMatches(mappedList));
        }

    private static HashMap<String, String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        HashMap<String, String> mappedList = new HashMap<>();
        for (int i = 0; i < girls.size(); i++) {
            mappedList.put(girls.get(i), boys.get(i));
        } return mappedList;

}
}
