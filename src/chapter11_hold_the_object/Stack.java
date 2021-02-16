package chapter11_hold_the_object;

import java.util.LinkedList;

/**
 * 第11章 持有对象
 * 11.8 Stack
 *
 * @author hy
 * @date 2021-02-15
 * @param <T>
 */
public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
