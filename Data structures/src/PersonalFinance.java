
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {

        //Create a list
        ArrayList<Integer> pF = new ArrayList<>();
        pF.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        System.out.println(pF);

        // How much did we spend?
        int sum = 0;
        for (int i : pF) {
            sum += i;
        }
        System.out.println(sum);

        //Which was our greatest?cheapest expense?
        System.out.println(Collections.max(pF));
        System.out.println(Collections.min(pF));

        //What was the average amount of our spendings?
        System.out.println(sum / pF.size());


        }




}