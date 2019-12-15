import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagramFunction_should_returnTrue_when_twoStringsAdded_areAnagrams() throws Exception {
        String first = "boban";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);

    }
    @Test
    public void anagramFunction_should_returnFalse_when_twoStringsAdded_areNotAnagrams() throws Exception {
        String first = "bobar";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertFalse(result);
    }
    @Test
    public void anagramFunction_should_returnFalse_when_differentLengthed_twoStringsAdded() throws Exception {
        String first = "bobankjiu";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertFalse(result);
    }
    @Test
    public void anagramFunction_should_returnFalse_when_twoStringsAdded_hasDifferentCharacters()  throws Exception{
        String first = "bobak";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertFalse(result);
    }
    @Test
    public void anagramFunction_should_returnTrue_when_twoStringsAdded_withMultipleSameCharacters() throws Exception{
        String first = "bobba";
        String second = "obbab";

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);
    }
    @Test
    public void anagramFunction_should_returnTrue_when_twoStringsAdded_hasSpecialCharacters() throws Exception{
        String first = "bob%";
        String second = "ob%b";

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);
    }
    @Test(expected = Exception.class)
    public void anagramFunction_should_returnFalse_when_oneOrTwoOfTheWordsAreMisiing() throws Exception {
        String first = "uziuit";
        String second = null;

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);
    }
}