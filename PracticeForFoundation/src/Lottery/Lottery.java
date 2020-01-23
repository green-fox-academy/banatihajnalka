package Lottery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {

        String filename = "src/Lottery/Lottery.txt";
        List<String> mostCommonNumbers = findMostCommonLotteryNumbers(filename);
        System.out.println(mostCommonNumbers);

    }

    private static List<String> findMostCommonLotteryNumbers (String filename) {
        List<String> text = readFile(filename);
        List<String> numbers = splitNumbers(text);
        HashMap<String, Integer> numberCount = numbersMap(numbers);
        return findFiveMostCommom(numberCount);
    }

    private static List<String> readFile(String filename) {

        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }

    private static List<String> splitNumbers (List<String> text) {
        List<String> numbers = new ArrayList<>();
        String lotteryNumbers = "";
       for (String rows : text) {
           for (int i = 12; i < 16; i++) {
            lotteryNumbers = rows.split(";")[i];
                numbers.add(lotteryNumbers);
            }
        }
        return numbers;
    }

    private static HashMap<String, Integer> numbersMap (List<String> numbers) {
        HashMap<String, Integer> numberCount = new HashMap<>();
        for (String number : numbers) {
            if (numberCount.containsKey(number)) {
                numberCount.put(number, numberCount.get(number) + 1);
            } else {
                numberCount.put(number, 1);
            }
        }
        return numberCount;
    }

    private static List<String> findFiveMostCommom (HashMap<String, Integer> numberCount) {
        List<String> mostCommonNumbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String mostCommonNumber = Collections.max(numberCount.entrySet(), Map.Entry.comparingByValue()).getKey();
            numberCount.remove(mostCommonNumber);
            mostCommonNumbers.add(mostCommonNumber);
        }
        return mostCommonNumbers;
    }
}
