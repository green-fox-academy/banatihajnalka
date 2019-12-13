import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {

    private CountLetters countLetters = new CountLetters();
    String word = "almas pite";
    HashMap<String, Integer> letterCounts = new HashMap<>();

    @Test(expected = Exception.class)
    public void lettersToHashMap_should_throwExeption_when_string_isEmpty() throws Exception {
        HashMap<String, Integer> letterCounts = CountLetters.lettersToHashMap("");
    }
    @Test(expected = Exception.class)
    public void lettersToHashMap_should_throwExeption_when_string_notExisting() throws Exception {
        HashMap<String, Integer> letterCounts = CountLetters.lettersToHashMap(null);
    }

    @Test
    public void lettersToHashMap_should_throwExeption_when_string_tooLong() {
        String word = "almas pite jlfeououerhckshdh";
    }
    @Test
    public void lettersToHashMap_isWorking() throws Exception {
        String word2 = "almaspite";
        HashMap<String, Integer> result = new HashMap<>();
        result.put("a", 2);
        result.put("l", 1);
        result.put("m", 1);
        result.put("s", 1);
        result.put("p", 1);
        result.put("i", 1);
        result.put("t", 1);
        result.put("e", 1);

        assertEquals(result, CountLetters.lettersToHashMap(word2));
    }

}