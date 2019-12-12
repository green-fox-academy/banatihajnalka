import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagramFunction_should_returnTrue_when_twoStringsAdded_areAnagrams() {
        String first = "boban";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);

    }
    @Test
    public void anagramFunction_should_returnFalse_when_twoStringsAdded_areNotAnagrams() {
        String first = "bobar";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertFalse(result);
    }
    @Test
    public void anagramFunction_should_returnFalse_when_differentLengthed_twoStringsAdded() {
        String first = "bobankjiu";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertFalse(result);
    }
    @Test
    public void anagramFunction_should_returnFalse_when_twoStringsAdded_hasDifferentCharacters() {
        String first = "bobak";
        String second = "nobab";

        boolean result = Anagram.anagramFunction(first, second);
        assertFalse(result);
    }
    @Test
    public void anagramFunction_should_returnTrue_when_twoStringsAdded_withMultipleSameCharacters() {
        String first = "bobba";
        String second = "obbab";

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);
    }
    @Test
    public void anagramFunction_should_returnTrue_when_twoStringsAdded_hasSpecialCharacters() {
        String first = "bob%";
        String second = "ob%b";

        boolean result = Anagram.anagramFunction(first, second);
        assertTrue(result);
    }
}