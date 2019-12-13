import org.junit.Test;

import java.util.HashMap;

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
}