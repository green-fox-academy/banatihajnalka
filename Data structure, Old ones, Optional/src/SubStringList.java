//  Create a function that takes a string and a list of string as a parameter
//  Returns the index of the string in the list where the first string is part of
//  Only need to find the first occurence and return the index of that
//  Returns `-1` if the string is not part any of the strings in the list
//  Example :  //  should print: `4`
                //  should print: `-1`

import java.util.Arrays;
import java.util.List;

public class SubStringList {

    public static void main(String[] args) {
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        String subStringToSearch = "not";

        subStrList(subStringToSearch, searchArr);
        System.out.println(subStrList("ching", searchArr));
        System.out.println(subStrList("not", searchArr));
    }

    private static int subStrList(String subStringToSearch, String[] searchArr) {
    String searchString = String.join(" ", searchArr);
    boolean isExists = searchString.contains(subStringToSearch);
        for (int i = 0; i < searchString.length(); i++) {
    } return searchString.indexOf(subStringToSearch);

    }
}
