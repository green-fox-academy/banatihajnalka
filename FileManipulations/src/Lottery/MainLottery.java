// Create a method that find the 5 most common lottery numbers in lottery.csv
package Lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static Lottery.MostCommonNumbers.findMostCommonNumbers;
import static Lottery.NumbersToHashMap.numbersToHashMap;
import static Lottery.ReadFile.readFile;
import static Lottery.SplitAndCollectNumbers.splitAndCollectNumbers;

public class MainLottery {

    public static void main(String[] args) {

        List<String> lotteryText = readFile("src\\Lottery\\Lottery.txt");
        Integer[][] splittedLotteryText = splitAndCollectNumbers(lotteryText);
//        System.out.println(Arrays.deepToString(splittedLotteryText));
        HashMap<Integer, Integer> numbersHashMap = numbersToHashMap(splittedLotteryText);
//        numbersHashMap.entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
        ArrayList<Integer> mostCommonNumber = findMostCommonNumbers(numbersHashMap);
        System.out.println(mostCommonNumber);

//        ArrayList<Integer> mostCommonNumber = findMostCommonNumbers(numbersToHashMap(splitAndCollectNumbers(readFile("src\\Lottery\\Lottery.txt"))));
//        System.out.println(mostCommonNumber);
    }

}
