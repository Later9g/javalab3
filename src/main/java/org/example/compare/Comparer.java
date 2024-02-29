package org.example.compare;

/** Предназначен для сравнения времени затраченного на выполнение операций*/
public class Comparer {

    /**
     * Сравнивает два значения, чтобы вставить их в таблицу
     *
     * @param a время, затраченное на операцию в ArrayList
     * @param b время, затраченное на операцию в LinkedList
     *
     */
    public static String difference(long a, long b){
        if(a > b){
            return "Операция в LinkedList быстрее на " + (a - b);
        }
        if(a < b){
            return "Операция в ArrayList быстрее на " + (b - a);
        }else{
            return "Операция занимает одинаковое время в двух списках";
        }
    }
}
