package org.example.tester.arrayList;

import java.util.ArrayList;

/**
 * Реализует тесты методов класса ArrayList
 * @author danila
 */
public class ArrayListTester{

    /**
     * проводит тесты методов (add, delete, get) у класса ArrayList
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
    private static ArrayList<Integer> fillArray(int repetitions){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < repetitions; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    /**
     * Тест времени заполнения списка ArrayList
     *
     * @param repetitions количество повторений
     *
     * @return время, затраченное на заполнение списка в наносекундах*/
    private static long addTest(int repetitions){
        long startTime, endTime;

        startTime = System.nanoTime();
        fillArray(repetitions);
        endTime = System.nanoTime();

        return endTime - startTime; //ns
    }

    /**
     * Тест времени удаления списка по одному элементу
     *
     * @param repetitions количество повторений
     *
     * @return время, затраченное на удаление списка в наносекундах*/
    private static long deleteTest(int repetitions){
        long startTime, endTime;
        ArrayList<Integer> arrayList = fillArray(repetitions);

        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();

        return endTime - startTime; //ns
    }

    /**
     * Тест времени получения значений списка по одному элементу
     *
     * @param repetitions количество повторений
     *
     * @return время, затраченное на получение элементов в наносекундах*/

    private static long getTest(int repetitions){
        long startTime, endTime;
        ArrayList<Integer> arrayList = fillArray(repetitions);

        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            arrayList.get(i % arrayList.size());
        }
        endTime = System.nanoTime();

        return endTime - startTime; //ns
    }
}
