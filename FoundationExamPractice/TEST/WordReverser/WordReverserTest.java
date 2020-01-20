package WordReverser;

import org.junit.Test;

import static WordReverser.WordReverser.wordReverser;
import static org.junit.Assert.*;

public class WordReverserTest {

    @Test
    public void wordReverser_should_give_reversedSentence_whenStringAdded() throws StringDoesNotExists {
        String toBeReversed = "lleW ,enod taht saw ton taht drah";
        String reversed = "Well done, that was not that hard";

        assertEquals(reversed, wordReverser(toBeReversed));
    }
    @Test(expected = StringDoesNotExists.class)
    public void wordReverser_should_throw_exception_whenEmptyStringAdded() throws StringDoesNotExists {
        String toBeReversed = "";
        String expected = "";
        wordReverser(toBeReversed);
        assertEquals(toBeReversed, expected);
    }

    @Test(expected = StringDoesNotExists.class)
    public void wordReverser_should_throw_exception_whenStringDoesNotExists() throws StringDoesNotExists {
        assertNull(wordReverser(null));
    }
}