import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class SumTest {

    private Sum sum = new Sum();
    private ArrayList<Integer> numbersList = new ArrayList<>();

    @Test
    public void sumArrayList_should_sumNumbers_when_numbersListAdded() throws Exception {
        numbersList.add(3);
        numbersList.add(5);
        numbersList.add(7);
        numbersList.add(9);

        int sumExpected = 24;
        int result = sum.sumArrayList(numbersList);
        
        assertEquals(sumExpected, result);
    }
    @Test
    public void sumArrayList_should_sumNumbers_when_negativeNumberAddedToTheList() throws Exception {
        numbersList.add(4);
        numbersList.add(-1);

        int expectedResult = 3;
        int result = sum.sumArrayList(numbersList);

        assertEquals(expectedResult, result);
    }
    @Test
    public void sumArrayList_should_sumNumbers_when_zeroAddedToTheList() throws Exception {
        numbersList.add(4);
        numbersList.add(0);

        int expectedResult = 4;
        int result = sum.sumArrayList(numbersList);

        assertEquals(expectedResult, result);
    }
    @Test
    public void sumArrayList_should_return0_when_emptyListIsGiven() throws Exception {
        int sumExpected = 0;
        int result = sum.sumArrayList(numbersList);

        assertEquals(sumExpected, result);
    }

    @Test
    public void sumArrayList_should_return0_when_oneElementIsGiven() throws Exception {
        numbersList.add(3);

        int sumExpected = 3;
        int result = sum.sumArrayList(numbersList);

        assertEquals(sumExpected,result);
    }

    @Test
    public void sumArrayList_should_return0_when_nullIsGIvenAsAnElement() throws Exception {
        numbersList.add(null);

        int expectedResult = 0;
        int result = sum.sumArrayList(numbersList);

        assertEquals(expectedResult, result);
    }
    @Test(expected = Exception.class)
    public void sumArrayList_should_throwExeption_when_listIsNotExisting() throws Exception {
        sum.sumArrayList(null);
    }
}