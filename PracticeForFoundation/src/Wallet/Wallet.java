package Wallet;

import java.util.*;

public class Wallet {

    int totalMoney;

    public static HashMap<Integer, Integer> payWithLessBanknotes(HashMap<Integer, Integer> wallet, int amount) {
        int totalMoney = countMoney(wallet);
        int originalAmount = amount;
        HashMap<Integer, Integer> payWith = new HashMap<>();

        if (totalMoney < amount) {
            return new HashMap<>();
        }
        Map<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(wallet);
        System.out.println("sortedwallet" + Arrays.asList(sortedMap));
        for (Map.Entry<Integer, Integer> sortedEntry : sortedMap.entrySet()) {
            payWith.put(sortedEntry.getKey(), 0);
        }
        System.out.println("sortedMap.entryset = " + sortedMap.entrySet());
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println("entry.getkey = " + entry.getKey());
            System.out.println("amount = " + amount);
            while (entry.getKey() <= amount) {
                if (entry.getValue() == 0) {
                    break;
//                    sortedMap.remove(entry.getKey());
                } else {
                    amount -= entry.getKey();
                    payWith.put(entry.getKey(), payWith.get(entry.getKey()) + 1);
                    sortedMap.put(entry.getKey(), sortedMap.get(entry.getKey()) - 1);
                }
                System.out.println(sortedMap);
                System.out.println(payWith);
                System.out.println("++++++++++++++++++++++++++=");
            }
        }
        System.out.println("PAYWITH = " + payWith);
        if (countMoney(payWith) != originalAmount) {
            return new HashMap<>();
        } else {
            return payWith;
        }
    }

    public static Integer countMoney(HashMap<Integer, Integer> wallet) {
        int totalMoney = 0;
        for (Map.Entry<Integer, Integer> entry : wallet.entrySet()) {
            totalMoney += entry.getKey() * entry.getValue();
        }
        return totalMoney;
    }
}
