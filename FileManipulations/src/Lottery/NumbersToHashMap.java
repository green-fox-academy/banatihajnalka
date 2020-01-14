package Lottery;

import java.util.HashMap;

public class NumbersToHashMap {

    static HashMap<Integer, Integer> numbersToHashMap(Integer[][] lotteryNumbers) {
        HashMap<Integer, Integer> numbersHashMap = new HashMap<>();
        for (Integer[] number : lotteryNumbers) {
            for (int i = 0; i < number.length; i++) {
                if (numbersHashMap.containsKey(number[i])) {
                    numbersHashMap.put(number[i], numbersHashMap.get(number[i]) + 1);
                } else {
                    numbersHashMap.put(number[i], 1);
                }
            }
        } return numbersHashMap;
    }
}
