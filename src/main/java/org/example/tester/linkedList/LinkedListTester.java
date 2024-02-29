package org.example.tester.linkedList;

import java.util.LinkedList;

/**
 * Реализует тесты методов класса LinkedList
 * @author danila
 */
public class LinkedListTester {
    /**
     * проводит тесты методов (add, delete, get) у класса LinkedList
     *
     * @param repetitions количество повторений
     *
     * @return массив значений типа {add, delete, get}
     */
    static long[] doAllTests(int repetitions){
        long[] arr = new long[3];
        arr[0] = addTest(repetitions);
        arr[1] = deleteTest(repetitions);
        arr[2] = getTest(repetitions);

        return arr;
    }

    /**
     * Заполняет список, для дальнейших использований
     *
     * @param repetitions количество повторений
     *
     * @return заполненный список*/
    private static LinkedList<Integer> fillList(int repetitions){
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < repetitions; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    /**
     * Тест времени заполнения списка LinkedList
     *
     * @param repetitions количество повторений
     *
     * @return время, затраченное на заполнение списка в наносекундах*/
    private static long addTest(int repetitions){
        long startTime, endTime;

        startTime = System.nanoTime();
        fillList(repetitions);
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    /**
     * Тест времени поэлементного удаления списка ArrayList
     *
     * @param repetitions количество повторений
     *
     * @return время, затраченное на заполнение списка в наносекундах*/
    private static long deleteTest(int repetitions){
        long startTime, endTime;
        LinkedList<Integer> linkedList = fillList(repetitions);

        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            linkedList.removeLast();
        }
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    /**
     * Тест времени поэлементного получения значений списка ArrayList
     *
     * @param repetitions количество повторений
     *
     * @return время, затраченное на заполнение списка в наносекундах*/
    private static long getTest(int repetitions){
        long startTime, endTime;
        LinkedList<Integer> linkedList = fillList(repetitions);

        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            linkedList.get(i % linkedList.size());
        }
        endTime = System.nanoTime();

        return endTime - startTime;
    }
}
