package lesson3_hw.deque;

public interface Deque<E> extends Iterable<E>{
    boolean insertFirst(E value);

    boolean insertLast(E value);

    E removeFirst();

    E removeLast();

    E peekFirst();

    E peekLast();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();
}
