package lesson3_hw.deque;

public class DequeImpl<E> implements Deque<E>{

    private final E[] data;
    private int TAIL_DEF = -1;
    private int HEAD_DEF = 0;

    private int size;
    private int tail;
    private int head;


    public DequeImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        head = HEAD_DEF;
        tail = TAIL_DEF;
    }

    @Override
    public boolean insertFirst(E value) {
        if (isFull()) {
            return false;
        }
        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertLast(E value) {
        if (isFull()) {
            return false;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E value = data[tail--];
        size--;
        return value;
    }

    @Override
    public E peekFirst() {
        return data[head];
    }

    @Override
    public E peekLast() {
        return data[tail];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);

            if (i != tail) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
