import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        HashMap<Integer,Character> hashMap = new HashMap<>();

        // Print out whether the map is empty or not
        System.out.println(hashMap.isEmpty());

        hashMap.put(97, 'a');
        hashMap.put(98, 'b');
        hashMap.put(99, 'c');
        hashMap.put(65, 'A');
        hashMap.put(66, 'B');
        hashMap.put(67, 'C');

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        hashMap.put(68, 'D');

        System.out.println(hashMap.size());
        System.out.println(hashMap.get(99));

        hashMap.remove(97);
        System.out.println(hashMap.get(97));


        System.out.println(hashMap.containsKey(100));
        System.out.println(hashMap.get(100) != null);

        hashMap.clear();
        System.out.println(hashMap.isEmpty());












    }
}
