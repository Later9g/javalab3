package org.example.tester.linkedList;


/**Создан для того, чтобы сделать методы класса LinkedListTester скрытыми*/
public interface LinkedListTesting {

    /** Возвращает массив значений типа {add, delete, get}
     *
     * @param repetitions количество повторений действий
     */
    static long[] testing(int repetitions){
        return LinkedListTester.doAllTests(repetitions);
    }
}
