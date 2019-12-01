// Create a function that
// - takes the name of a CSV file as a parameter,
//   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happened.
//   - if there were multiple years with the same number of births then return any one of them
// You can find such a CSV file in this directory named births.csv
// If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Births {
    public static void main(String[] args) {

        String filename = "Births.csv";
        //     readFile(filename);
        //     splitText(readFile(filename));
        //      birthYearsFunction(splitText(readFile(filename)));
        //     mostCommonYears(birthYearsFunction(splitText(readFile(filename))));

        System.out.println(mostCommonYears(birthYearsFunction(splitText(readFile(filename)))));
    }

    public static String mostCommonYears(List<String> birthYears) {
        HashMap<String, Integer> years = new HashMap<>();
        for (String year : birthYears) {
            if (!years.containsKey(year)) {
                years.put(year, 1);
            } else {
                years.replace((year), years.get(year) + 1);
            }
        }
        String mostCommonYear = "";
        int mostYearCount = Collections.max(years.values());
        for (String count : years.keySet()) {
            if (mostYearCount == years.get(count)) {
                mostCommonYear = count;
                break;
            }
        } return mostCommonYear;
    }

    public static List<String> birthYearsFunction(List<String> birthDates) {
        String[] dateParts = new String[birthDates.size()];
        List<String> birthsYears = new ArrayList<>();
        for (int i = 0; i < birthDates.size(); i++) {
            dateParts = birthDates.get(i).split("-");
            birthsYears.add(i, dateParts[0]);
        }
        return birthsYears;
    }

    public static List<String> splitText(List<String> text) {
        String[] splitText = new String[text.size()];
        List<String> birthsDates = new ArrayList<>();
        for (int i = 0; i < text.size(); i++) {
            splitText = text.get(i).split(";");
            birthsDates.add(i, splitText[1]);
        }
        return birthsDates;
    }

    public static List readFile(String filename) {
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(filename));
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }
}
