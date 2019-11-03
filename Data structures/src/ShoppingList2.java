import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {

        HashMap<String, Double> sL2 = new HashMap<>();
        sL2.put("Milk", 1.07);
        sL2.put("Rice", 1.59);
        sL2.put("Eggs", 3.14);
        sL2.put("Cheese", 12.60);
        sL2.put("Chicken Breasts", 9.40);
        sL2.put("Apples", 2.31);
        sL2.put("Tomato", 2.58);
        sL2.put("Potato", 1.75);
        sL2.put("Onion", 1.10);

        System.out.println(sL2.isEmpty());

        HashMap<String, Integer> bobsList = new HashMap<>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        HashMap<String, Integer> alicesList = new HashMap<>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breasts", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);


        //How much does Bob pay?
        double sumBob = 0;
        for (Map.Entry<String, Integer> database : bobsList.entrySet()) {
            sumBob += sL2.get(database.getKey()) * database.getValue();
        }
        System.out.println("Bod paid: " + sumBob);

        //How much does Alice pay?
        double sumAlice = 0.0;
        for (Map.Entry<String, Integer> list : alicesList.entrySet()) {
            sumAlice += sL2.get(list.getKey()) * list.getValue();
        }
        System.out.println("Alice paied: " + sumAlice);

        //Who buys more Rice?
        if (bobsList.get("Rice") > alicesList.get("Rice")) {
            System.out.println("Bob bought more rice.");
        } else if (bobsList.get("Rice") < alicesList.get("Rice")) {
            System.out.println("Alice bougth more rice.");
        } else {
            System.out.println("They bought the same amount");
        }

        //Who buys more Potato?
        if (bobsList.containsKey("Potato") && alicesList.containsKey("Potato") != true) {
            System.out.println("One of us did not bought potato.");
        }
        if (bobsList.containsKey("Potato") && alicesList.containsKey("Potato") == true) {
            if (bobsList.get("Potato") > alicesList.get("Potato")) {
                System.out.println("Bob bought more potato.");
            } else if (bobsList.get("Potato") < alicesList.get("Potato")) {
                System.out.println("Alice bougth more potato.");
            } else
                System.out.println("They bought the same amount");
        }

        //Who buys more different products?
        if (bobsList.size() == alicesList.size()) {
            System.out.println("They bought the same amount of products.");
        } else if (bobsList.size() > alicesList.size()) {
            System.out.println("Bob bought more products.");
        } else {
            System.out.println("Alice bought more products.");
            }

        //Who buys more products? (piece)
        int sumBobCount = 0;
        for (Integer sumBobCounter : bobsList.values()) {
            sumBobCount += sumBobCounter;
        }
        int sumAliceCount = 0;
        for (Integer sumAliceCounter : alicesList.values()) {
            sumAliceCount += sumAliceCounter;
        }
        if (sumBobCount == sumAliceCount) {
            System.out.println("They bought the same amount");
        } else if (sumBobCount > sumAliceCount) {
            System.out.println("Bob bougth more products");
        } else {
            System.out.println("Alice bougth more products");
        }
        }
    }

