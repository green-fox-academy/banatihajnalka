package Lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonNumbers {

    static ArrayList<Integer> findMostCommonNumbers(HashMap<Integer, Integer> numbersHashMap) {
        ArrayList<Integer> mostCommonNumbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer mostCommonNumber = Collections.max(numbersHashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            numbersHashMap.remove(mostCommonNumber);
            mostCommonNumbers.add(mostCommonNumber);
        } return mostCommonNumbers;
    }
}
//        numbersHashMap.remove(key);
//        mostCommonNumbers.put((int) key, value);
//    }
//}
