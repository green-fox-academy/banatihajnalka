package Wallet;

import java.util.*;

public class Wallet {

    public static HashMap<Integer, Integer> payWithLessBanknotes(HashMap<Integer, Integer> wallet, int amount) {
        int totalMoney = countMoney(wallet);
        int originalAmount = amount;
        HashMap<Integer, Integer> payWith = new HashMap<>();

        if (totalMoney < amount) {
            return new HashMap<>();
        }
        Map<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(wallet);
        for (Map.Entry<Integer, Integer> sortedEntry : sortedMap.entrySet()) {
            payWith.put(sortedEntry.getKey(), 0);
        }
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            while (entry.getKey() <= amount) {
                if (entry.getValue() == 0) {
                    break;
                } else {
                    amount -= entry.getKey();
                    payWith.put(entry.getKey(), payWith.get(entry.getKey()) + 1);
                    sortedMap.put(entry.getKey(), sortedMap.get(entry.getKey()) - 1);
                }
            }
        }
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
