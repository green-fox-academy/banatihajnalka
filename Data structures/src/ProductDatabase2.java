import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> pD2 = new HashMap<>();
        pD2.put("Eggs", 200);
        pD2.put("Milk", 200);
        pD2.put("Fish", 400);
        pD2.put("Apples", 150);
        pD2.put("Bread", 50);
        pD2.put("Chicken", 550);

        System.out.println(pD2.isEmpty());

        //Which products cost less than 201? (just the name)
        for (Map.Entry<String, Integer> database : pD2.entrySet()) {
            if (database.getValue() < 201) {
                System.out.printf(database.getKey() + " ");
            }
        }
        System.out.println();

        //Which products cost more than 150? (name + price)?
        for (Map.Entry<String, Integer> database : pD2.entrySet()) {
            if (database.getValue() > 105) {
                System.out.printf("%s : %s \n", database.getKey(), database.getValue());

                }
            }

        }
    }
