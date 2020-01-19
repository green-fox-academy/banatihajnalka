package WorstSongs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static WorstSongs.WorstSongs.*;

public class MainWorstSongs {
    public static void main(String[] args) {
        List<String> songs = readFile("src/WorstSongs/WorstSongs.txt");
        System.out.println(songs);

        List<String> years = splitSongs(songs);
        System.out.println(years);

        Map<String, Integer> yearsInHashMap = yearsToHashMap(years);
        System.out.println(yearsInHashMap);

        String mostCommonYear = findMaxValue(yearsInHashMap);
        System.out.println(mostCommonYear);
    }
}
