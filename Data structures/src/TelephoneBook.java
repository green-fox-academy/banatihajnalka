import java.util.HashMap;
import java.util.Map;


public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("William A. Lathan", "405-709-1865");
        hashMap.put("John K. Miller", "402-247-8568");
        hashMap.put("Hortensia E. Foster", "606-481-6467");
        hashMap.put("Amanda D. Newland", "319-243-5613");
        hashMap.put("Brooke P. Askew", "307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println(hashMap.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        String phoneNumber = "307-687-2982";
        for (Map.Entry<String, String> book: hashMap.entrySet()) {
            if (book.getValue() == phoneNumber) {
                System.out.println(book.getKey());
            }
        }

        //Do we know Chris E. Myers' phone number?
        String name = "Chris E. Myers";
        if (hashMap.containsKey(name) == true) {
            System.out.println("His number is: " + hashMap.get(name) + ".");
        } else {
            System.out.println("This name is not in the telephone book.");
        }
        }

    }


