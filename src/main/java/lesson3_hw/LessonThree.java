package lesson3_hw;

import lesson3_hw.stack.Test;

public class LessonThree {
    public static void main(String[] args) {
        SearchElement searchElement = new SearchElement();
        System.out.println(searchElement.startSearch(searchElement.getArr()));

        Test test = new Test();
        test.testStack();
        System.out.println();
        test.testDeque();
    }
}


/*
1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1).
    Но в массиве гарантированно 1 число пропущено. Необходимо вывести на экран пропущенное число.
        Примеры:
        [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
        [1, 2, 4, 5, 6] => 3
        [] => 1

2. Создать класс для реализации Deque.
*/
