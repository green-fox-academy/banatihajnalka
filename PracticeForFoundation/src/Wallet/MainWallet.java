package Wallet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static Wallet.Wallet.payWithLessBanknotes;

public class MainWallet {

    public static void main(String[] args) {
        HashMap<Integer, Integer> walletContent = new HashMap<>();
        walletContent.put(20000, 1);
        walletContent.put(10000, 1);
        walletContent.put(5000, 1);
        walletContent.put(2000, 3);
        walletContent.put(1000, 2);
        walletContent.put(500, 0);
        walletContent.put(200, 0);
        walletContent.put(100, 3);
        walletContent.put(50, 2);
        walletContent.put(20, 3);
        walletContent.put(10, 0);
        walletContent.put(5, 1);

        System.out.println(Collections.singletonList(walletContent));

//        HashMap<Integer, Integer> sortedWallet = payWithLessBanknotes(walletContent, 33250);
//        HashMap<Integer, Integer> sortedWallet = payWithLessBanknotes(walletContent, 50000);
        HashMap<Integer, Integer> sortedWallet = payWithLessBanknotes(walletContent, 33253);
        System.out.println(Collections.singletonList(sortedWallet));
    }
}
