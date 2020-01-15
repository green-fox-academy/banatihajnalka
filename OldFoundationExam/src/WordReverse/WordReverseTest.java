package WordReverse;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverseTest {

        @Test
        public void reserveShouldReserveSentence () {
        String sentenceToReserve = "lleW ,enod taht saw ton taht drah";
        String expected = "Well done, that was not that hard";
        String result = WordReverse.reverse(sentenceToReserve);

        assertEquals(expected, result);
    }

    @Test
    public void reversShouldReverseTheWordIfStringIsEmpty(){
        String sentence = "";
        String expected = "";

        String result = WordReverse.reverse(sentence);
        assertEquals(expected, result);
    }
    }