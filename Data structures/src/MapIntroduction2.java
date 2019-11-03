import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("978-1-60309-452-8", "A Letter to Jo");
        hashMap.put("978-1-60309-459-7", "Lupus");
        hashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        hashMap.put("978-1-60309-461-0", "The Lab");

        System.out.println(hashMap.isEmpty());

        //  Print all the key-value pairs in the following format
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println(mentry.getValue() + " (ISBN: " + mentry.getKey() + ")");
        }

        //Remove the key-value pair with key
        hashMap.remove("978-1-60309-444-3");
        System.out.println(hashMap.keySet());

        // Remove the key-value pair with value
        hashMap.values().remove("The Lab");
        System.out.println(hashMap.values());

        hashMap.put("978-1-60309-450-4","They Called Us Enemy");
        hashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        // Print whether there is an associated value with key
        System.out.println(hashMap.get("478-0-61159-424-8") != null);

        System.out.println(hashMap.get("978-1-60309-453-5"));



    }

}