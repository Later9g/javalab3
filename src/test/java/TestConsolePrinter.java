import org.example.out.ConsolePrinter;
import org.example.tester.arrayList.ArrayListTesting;
import org.example.tester.linkedList.LinkedListTesting;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertFalse;

public class TestConsolePrinter {
    private final int repetitions = 3000;
    private long[] wrongResults;
    private long[] resultsOfArrayListTesting;
    private long[] resultsOfLinkedListTesting;

    @Before
    public void setUp(){
        wrongResults = new long[2];
        resultsOfArrayListTesting = ArrayListTesting.testing(repetitions);
        resultsOfLinkedListTesting = LinkedListTesting.testing(repetitions);
    }

    //Проверка, что метод printTable перехватит ошибку с разметом массива
    @Test(expected = RuntimeException.class)
    public void testArrLengthInPrintTable(){
        ConsolePrinter.printTable(wrongResults,resultsOfLinkedListTesting, repetitions);
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    //Проверка, что в консоль что-то выводится
    @Test
    public void testConsoleOutput() {
       ConsolePrinter.printTable(resultsOfArrayListTesting,resultsOfLinkedListTesting,repetitions);

        assertFalse(systemOutRule.getLog().isEmpty());
    }

}
