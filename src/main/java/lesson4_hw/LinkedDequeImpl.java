package lesson4_hw;

import lesson3_hw.deque.Deque;
import java.util.Iterator;

public class LinkedDequeImpl<E> implements Deque<E>{

    private final TwoSideLinkedList<E> data;
    private int index = 0;

    public LinkedDequeImpl() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    @Override
    public boolean insertFirst(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertLast(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeFirst() {
        return data.removeFirst();
    }

    @Override
    public E removeLast() {
        return data.removeFirst();
    }

    @Override
    public E peekFirst() {
        return data.getFirst();
    }

    @Override
    public E peekLast() {
        return data.getLast();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "LinkedDequeImpl{" +
                "data=" + data +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }
}