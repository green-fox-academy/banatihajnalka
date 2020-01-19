package TextFromMatrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextFromMatrixTest {


    @Test
    public void textFromMatrix_should_makeString_when_StringArrayAdded() throws MyOwnExceptions {
        String[][] firstArray = {{"n", "x"}, {"m", "o"}};
        String[][] secondArray = {{"h", "p", "e"}, {"k", "l", "a"}, {"l", "m", "o"}};

        String expected = "hklplmeao";

        assertFalse(TextFromMatrix.textFromMatrix(firstArray).isEmpty());
        assertFalse(TextFromMatrix.textFromMatrix(secondArray).isEmpty());
        assertEquals(expected, TextFromMatrix.textFromMatrix(secondArray));
    }

    @Test(expected = MyOwnExceptions.class)
    public void textFromMatrix_should_return0_when_emptyStringArrayAdded() throws MyOwnExceptions {
        TextFromMatrix.textFromMatrix(null);
    }

    @Test(expected = MyOwnExceptions.class)
    public void textFromMatrix_shouldReturnMessage_whenEmptyStringListAdded() throws MyOwnExceptions {
        String[][] input = new String[][]{};
        TextFromMatrix.textFromMatrix(input);
    }
}