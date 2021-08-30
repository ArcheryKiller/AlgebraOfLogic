package lesson3_hw.stack;

import lesson3_hw.deque.Deque;
import lesson3_hw.deque.DequeImpl;

public class Test {
    public void testStack() {
        Stack<Integer> stack = new StackImpl<>(5);

        if (!stack.isEmpty()) {
            stack.pop();
        }

        addToStack(stack, 12);
        addToStack(stack, 5);
        addToStack(stack, 45);
        addToStack(stack, 29);
        addToStack(stack, 8);
        addToStack(stack, 14);

        stack.display();
        System.out.println("last value: " + stack.pop() );

        stack.display();
        System.out.println("last value: " + stack.peek() );
    }

    public void testDeque() {
        Deque<Integer> deque = new DequeImpl<>(5);

        deque.insertLast(45);
        deque.insertLast(29);
        deque.insertLast( 12);
        deque.insertLast(5);
        deque.insertLast(8);
        deque.insertLast(14);

        deque.display();
        System.out.println("last value: " + deque.removeFirst() );
        deque.display();

        System.out.println("last value: " + deque.removeLast() );
        deque.display();

        deque.insertLast(14);
        deque.insertFirst(8);
        deque.insertFirst(8);
        deque.insertLast(14);
        deque.display();


//        System.out.println("last value: " + deque.peekLast() );
    }

    private boolean addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }
}
