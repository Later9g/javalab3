import org.example.tester.arrayList.ArrayListTesting;

import org.example.tester.linkedList.LinkedListTesting;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/** Проверки что интерфейсы вернут непустые значения и их будет 3 */
public class TestListInterfaces {
    private long[] resultsOfArrayListTesting;
    private long[] resultsOfLinkedListTesting;

    @Before
    public void setUp(){
        int repetitions = 3000;
        resultsOfArrayListTesting = ArrayListTesting.testing(repetitions);
        resultsOfLinkedListTesting = LinkedListTesting.testing(repetitions);
    }

    //Проверка размера массива результатов ArrayListTesting
    @Test
    public void testLengthArrayListInterface(){
        assertEquals(3,resultsOfArrayListTesting.length);
    }

    //Проверка, что результаты тестов ArrayListTesting не нулевые
    @Test
    public void testNotNullResultsInArrayListInterface(){
        assertNotEquals(0,resultsOfArrayListTesting[0]);
        assertNotEquals(0,resultsOfArrayListTesting[1]);
        assertNotEquals(0,resultsOfArrayListTesting[2]);
    }

    //Проверка размера массива результатов LinkedListTesting
    @Test
    public void testLengthLinkedListInterface(){
        assertEquals(3,resultsOfLinkedListTesting.length);
    }

    //Проверка, что результаты тестов LinkedListTesting не нулевые
    @Test
    public void testNotNullResultsInLinkedListInterface(){
        assertNotEquals(0,resultsOfLinkedListTesting[0]);
        assertNotEquals(0,resultsOfLinkedListTesting[1]);
        assertNotEquals(0,resultsOfLinkedListTesting[2]);
    }
}
