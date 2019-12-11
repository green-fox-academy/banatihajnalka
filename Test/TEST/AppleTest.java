import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

        @Test
        public void getApple_should_getString_whenStringGiven () {
            Apple apple = new Apple();
            String expectedResult = "apple";
//            String expectedResultFail = "pinapple";
            String result = apple.getApple();

            assertEquals(expectedResult, result);
//            assertEquals(expectedResultFail, result);

        }
    }