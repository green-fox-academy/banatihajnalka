import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap2 {

        public static void main(String... args){
            ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
            quoteSwap(list);
        }

        public static void quoteSwap(ArrayList<String> list) {
            Collections.swap(list, 2, 5);
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%s ", list.get(i));
            }
        }
    }
