import java.util.ArrayList;
import java.util.Arrays;

// Write a method that joins the two lists by matching one girl with one boy into a new list
// If someone has no pair, he/she should be the element of the list too
// Expected output: "Eve", "Joe", "Ashley", "Fred"...

public class MatchMaking {
    public static void main(String[] args) {
            ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
            ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff", "BBBB", "CCCC"));

            System.out.println(makingMatches(girls, boys));
        }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> mappedList = new ArrayList<>();
        int size = Math.min(girls.size(), boys.size());
        for (int i = 0; i < size; i++) {
            mappedList.add(girls.get(i));
            mappedList.add(boys.get(i));
        }
        if (girls.size() > boys.size()) {
            girls.removeAll(boys);
            mappedList.addAll(girls);
        } else if (boys.size() > girls.size()) {
            boys.removeAll(girls);
            mappedList.addAll(boys);
        }
        return mappedList;
    }
}
