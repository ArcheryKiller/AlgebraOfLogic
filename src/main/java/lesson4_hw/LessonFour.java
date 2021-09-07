package lesson4_hw;

import lesson3_hw.deque.Deque;

public class LessonFour {

    public static void main(String[] args) {

        getValueSideList();
        getValueDequeList();
    }

    private static void getValueSideList() {
        TwoSideLinkedList<Integer> twoSideLinkedList = new TwoSideLinkedListImpl<>();

        twoSideLinkedList.insertFirst(3);
        twoSideLinkedList.insertLast(4);
        twoSideLinkedList.insertFirst(2);
        twoSideLinkedList.insertLast(5);
        twoSideLinkedList.insertFirst(1);

        twoSideLinkedList.display();
        System.out.println("First element: " + twoSideLinkedList.getFirst());

        twoSideLinkedList.removeFirst();
        twoSideLinkedList.remove(4);

        twoSideLinkedList.display();
        System.out.println("Last element: " + twoSideLinkedList.getLast());

        for (Integer value : twoSideLinkedList) {
            System.out.println("value: " + value);
        }
    }

    private static void getValueDequeList() {
        Deque<Integer> linkedDeque = new LinkedDequeImpl<>();

        linkedDeque.insertFirst(13);
        linkedDeque.insertLast(16);
        linkedDeque.insertFirst(10);
        linkedDeque.insertLast(19);
        linkedDeque.insertFirst(7);

        linkedDeque.display();
        System.out.println("First element: " + linkedDeque.peekFirst());

        linkedDeque.removeFirst();
        linkedDeque.removeLast();

        linkedDeque.display();
        System.out.println("Last element: " + linkedDeque.peekLast());

        for (Integer value : linkedDeque) {
            System.out.println("value: " + value);
        }
    }
}


/*
1. Реализовать цикл forEach для простого связанного списка
2. Реализовать Deque на основе двунаправленного списка
*/
