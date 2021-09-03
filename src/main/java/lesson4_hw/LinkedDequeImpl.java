package lesson4_hw;

import lesson3_hw.deque.Deque;

import java.util.Iterator;

public class LinkedDequeImpl<E> implements Deque<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public LinkedDequeImpl() {
        head = null;
        tail = null;
    }

    @Override
    public boolean insertFirst(E value) {
        Node<E> temp = new Node<>(value);

        if (isEmpty())
            tail = temp;
        else
            temp.previous = temp;

        temp.next = head;
        head = temp;
        size++;
        return true;
    }

    @Override
    public boolean insertLast(E value) {
        Node<E> temp = new Node<>(value);

        if (isEmpty())
            head = temp;
        else
            tail.next = temp;

        temp.previous = tail;
        tail = temp;
        size++;
        return true;
    }

    @Override
    public E removeFirst() {
        Node<E> temp = head;

        if (head.next == null)
            tail = null;
        else
            head.next.previous = null;

        head = head.next;
        size--;
        return temp.item;
    }

    @Override
    public E removeLast() {
        Node<E> temp = tail;

        if (head.next == null)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
        size--;
        return temp.item;
    }

    @Override
    public E peekFirst() {
        return getValue(head);
    }

    @Override
    public E peekLast() {
        return getValue(tail);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append("<->");
            }

            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedDequeImplIterator(this);
    }

    private E getValue(Node<E> eNode) {
        return eNode != null ? eNode.item : null;
    }

    public class LinkedDequeImplIterator implements Iterator<E> {

        private Node<E> currentNode;

        LinkedDequeImplIterator(LinkedDequeImpl<E> instance) {
            this.currentNode = instance.head;
        }

        @Override
        public boolean hasNext() {
            return this.currentNode != null;
        }

        @Override
        public E next() {
            E value = this.currentNode.item;
            this.currentNode = this.currentNode.next;
            return value;
        }
    }
}