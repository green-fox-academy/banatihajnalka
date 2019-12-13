import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ExtensionTest {

    Extension extension = new Extension();

    @Test
    public void add_should_result_addNumbers_when_numbersAdded() {
        assertEquals(5, extension.add(3, 2));
    }
    @Test
    public void add_whenNumberIsNegative() {
        assertEquals(3, extension.add(4, -1));
    }
    @Test
    public void add_shoud_returnIntegerMaxVelue_when_sumIsBiggerThanMaximum() {
        int max = Integer.MAX_VALUE;
        int a = 5;
        int expectedResult = Integer.MAX_VALUE;

        int result = extension.add(max, a);

        assertEquals(expectedResult, result);
    }


    @Test
    public void maxOfThree() {
        assertEquals(6, extension.maxOfThree(3,5, 6));
    }
    @Test
    public void maxOfThree_withNegativeNumber() {
        assertEquals(0, extension.maxOfThree(-1,0, -2));
    }
    @Test
    public void maxOfThree_withDuplicatedNumbers() {
        assertEquals(3, extension.maxOfThree(3,3, 3));
    }

    @Test
    public void median_with_oddAmountOfNumbers() {
        List<Integer> pool = Arrays.asList(3, 5, 7);
        assertEquals(5, extension.median(pool));
    }
    @Test
    public void median_with_evenAmountOfNumbers() {
        List<Integer> pool = Arrays.asList(3, 5, 7, 9);
        assertEquals(6, extension.median(pool));
    }
    @Test
    public void median_with_numbersNotInOrder() {
        List<Integer> pool = Arrays.asList(3, 6, 4);
        assertEquals(4, extension.median(pool));
    }
    @Test
    public void median_with_negativeNumbers() {
        List<Integer> pool = Arrays.asList(-2, 6, 4);
        assertEquals(4, extension.median(pool));
    }

    @Test
    public void isVowel() {
        List<Character> charList = Arrays.asList('a', 'u', 'o', 'e', 'i');
        assertFalse(extension.isVowel('c'));
    }

    @Test
    public void translate_should_throwExeption_when_stringIsEmpty() {
        String teve = "";
    }
    @Test
    public void translate() throws Exception {
        String teve = "hungarian";
        assertEquals(extension.translate(teve), "huvungavariviavan");
    }
    @Test
    public void translate2() throws Exception {
        String teve = "beszélni";
        assertEquals(extension.translate(teve), "beveszévélnivi");
    }
}