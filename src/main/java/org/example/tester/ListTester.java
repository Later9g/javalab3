package org.example.tester;


import org.example.out.ConsolePrinter;
import org.example.tester.arrayList.ArrayListTesting;
import org.example.tester.linkedList.LinkedListTesting;

/**
 * Тесты времени методов в списках LinkedList и ArrayList
 */
public class ListTester {
    /**
     * Вывод всех результатов тестов в консоль в формате таблицы
     *<p>
     *  Пример использования:
     * <pre>
     * {@code
     *  ListTester.test(2000);
     * }
     * </pre>
     *
     * @param repetitions количество элементов в списках
     */
    public static void test(int repetitions){
        long[] valuesArrayList = ArrayListTesting.testing(repetitions);
        long[] valuesLinkedList = LinkedListTesting.testing(repetitions);

        ConsolePrinter.printTable(valuesArrayList,valuesLinkedList,repetitions);
    }
}
