import org.junit.Test;

import java.awt.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PalindromeSearcherTest {

    @Test
    public void palindromeSearcher_shouldReturnStringListWithPalindromes_withStringInput() {
        String text = "cofefee";
        assertFalse(PalindromeSearcher.searchPalindromeFunction(text).isEmpty());
        assertEquals(2, PalindromeSearcher.searchPalindromeFunction(text).size());
        assertEquals(Arrays.asList("fef", "efe"), PalindromeSearcher.searchPalindromeFunction(text));
    }
    @Test(expected = MyOwnException.class)
    public void palindromeSearcher_whenInputIsNull_shold() throws MyOwnException {
        PalindromeSearcher.searchPalindromeFunction("");
    }

    @Test
    public void palindromeSearcher_shouldReturnStringListWithPalindromes_withGivenNoStringInput() {
        String text = "coffee";
        assertTrue(PalindromeSearcher.searchPalindromeFunction(text).isEmpty());
    }

    @Test
    public void palindromeSearcher_shouldReturnStringListWithPalindromes_withGivenTheSameCharacters() {
        String text = "rrrrr";
        assertEquals(6, PalindromeSearcher.searchPalindromeFunction(text).size());
    }

    @Test
    public void palindromeSearcher_shouldReturnStringListWithPalindromes_whenUpperCaseCharactersAreGiven() {
        String text = "rrRrr";
        assertEquals(6, PalindromeSearcher.searchPalindromeFunction(text).size());
    }

}