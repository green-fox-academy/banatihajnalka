import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> pD = new HashMap<>();
        pD.put("Eggs", 200);
        pD.put("Milk", 200);
        pD.put("Fish", 400);
        pD.put("Apples", 150);
        pD.put("Bread", 50);
        pD.put("Chicken", 550);

        System.out.println(pD.isEmpty());

        //How much is the fish?
        System.out.println(pD.get("Fish"));

        //What is the most expensive product?
        System.out.println(Collections.max(pD.values()));

        //What is the average price?
        int sum = 0;
        for (int prices : pD.values()) {
            sum += prices;
        }
        System.out.println(sum / pD.size());

        //How many products' price is below 300?
        int below = 0;
        for (Integer prices : pD.values()) {
            if (prices < 300) {
                below += 1;
            }
        }
        System.out.println(below);

        //Is there anything we can buy for exactly 125?
        for (Map.Entry<String, Integer> database : pD.entrySet()) {
            if (database.getValue() == 125) {
                System.out.println("Yes" + database.getKey());
            }
        }
        if (pD.containsValue(125) == false) {
            System.out.println("No.");
        }
        //What is the cheapest product?
        int min = Collections.min(pD.values());
        System.out.println(min);
    }
}