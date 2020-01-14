package Lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SplitAndCollectNumbers {

    static Integer[][] splitAndCollectNumbers(List<String> lotteryText) {
        Integer[][] lotteryNumbers= new Integer[lotteryText.size()][5];
        for (int j = 0; j < lotteryText.size(); j++) {
            String currentString = lotteryText.get(j);
            String[] currentArr = currentString.split(";");
            for (int i = 11; i <=15; i++) {
                lotteryNumbers[j][i-11] = Integer.valueOf(currentArr[i]);
            }
        }
        return lotteryNumbers;
    }
}
