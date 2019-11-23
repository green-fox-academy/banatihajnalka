// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().
// Also, print the sentence to the output with spaces in between.
// Expected output: "What I cannot create I do not understand."

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println(quoteSwap(list));

    }

    private static String quoteSwap(ArrayList<String> list) {
        Collections.swap(list, 2, 5);
        String joined = String.join(" ", list);  //better with delimiter " ", using "," made to spaces besides to leave the comma between the two part
   //     String result = joined.replace(",", " ");
        return joined;
    }
}
