package org.example.tester.arrayList;

/**Создан для того, чтобы сделать методы класса ArrayListTester скрытыми*/
public interface ArrayListTesting {

    /** Возвращает массив значений типа {add, delete, get}
     *
     * @param repetitions количество повторений действий
     */
    static long[] testing(int repetitions){
        return ArrayListTester.doAllTests(repetitions);
    }
}
