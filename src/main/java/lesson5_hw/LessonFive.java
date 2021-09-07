package lesson5_hw;

import java.util.ArrayList;
import java.util.List;

public class LessonFive {
    private static Exponentiation exponent = new Exponentiation(5, 3);

    public static void main(String[] args) {

        //Задание 1
        System.out.println(exponent.exponentiation(exponent.getValue(), exponent.getDegree()));

        //Задание 2
        List<Item> items = new ArrayList<>();
        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Телефон", 2, 5000));
        items.add(new Item("Часы", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Кольцо", 1, 500));

        Backpack backpack = new Backpack(8);
        backpack.makeAllSets(items);
        System.out.println(backpack.getBestItems());
    }
}


/*
1. Написать программу по возведению числа в степень с помощью рекурсии. - completed-
2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
 */
