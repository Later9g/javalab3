package org.example.out;

import static org.example.compare.Comparer.difference;

/**
 * Вывод таблицы результатов сравнений в консоль
 */
public class ConsolePrinter {

    /**Выводит результаты сравнений в консоль в виде таблицы
     *<p>
     * Вид таблицы:
     * <p>
     * Кол-во выполнений, Время в ArrayList, Время в LinkedList, Разница во времени
     *
     * @param arrayList массив значений тестов ArrayList
     * @param linkedList массив значений тестов LinkedList
     * @param repetitions количество элементов
     * */
    public static void printTable(long[] arrayList, long[] linkedList, int repetitions){
        if (arrayList.length != 3 || linkedList.length !=3){
            throw new RuntimeException("ArrayLengthException");
        }

        System.out.printf("%-15s %-30s %-30s %-30s %-30s\n", "Метод", "Количество выполнений", "Время выполнения в ArrayList" , "Время выполнения в LinkedList", "Разница во времени");
        System.out.printf("%-15s %-30s %-30s %-30s %-30s\n", "add", repetitions, arrayList[0] + "ns", linkedList[0] + "ns", difference(arrayList[0],linkedList[0]));
        System.out.printf("%-15s %-30s %-30s %-30s %-30s\n", "delete", repetitions, arrayList[1] + "ns", linkedList[1] + "ns",difference(arrayList[1],linkedList[1]));
        System.out.printf("%-15s %-30s %-30s %-30s %-30s\n", "get", repetitions, arrayList[2] + "ns", linkedList[2] + "ns",difference(arrayList[2],linkedList[2]));
    }
}
