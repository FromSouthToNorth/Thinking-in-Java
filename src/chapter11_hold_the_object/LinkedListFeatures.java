package chapter11_hold_the_object;

import java.util.LinkedList;

/**
 * 第11章 持有对象
 * 11.7 LinkedList
 *
 * @author hy
 * @date 2021-02-15
 */
public class LinkedListFeatures {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        // Identical 相同 获取第一个元素
        System.out.println("list.getFirst(): " + list.getFirst());
        System.out.println("list.element(): " + list.element());
        // Only differs in empty-list behavior: (唯一不同的是空列表的行为:)
        // 查看列表是否为空，空返回 null，不为空返回第一个 element
        System.out.println("list.peek(): " + list.peek());
        // Identical: remove and return the first element: (相同:移除并返回第一个元素:)
        System.out.println("list.remove(): " + list.remove());
        System.out.println("list.removeFirst(): " + list.removeFirst());
        // Only differs in empty-list behavior: (唯一不同的是空列表的行为:)
        // 查看列表是否为空，空返回 null，不为空返回第一个 element
        System.out.println("list.poll(): " + list.poll());
        System.out.println(list);
        list.addFirst(7);
        System.out.println("list.addFirst(): " + list);
        // 尾部插入 element
        list.offer(3);
        System.out.println("After offer(): " + list);
        // 尾部插入 element
        list.addLast(8);
        System.out.println("list.addLast(): " + list);
        // 删除尾部 element
        System.out.println("list.removeLast(): " + list.removeLast());
    }

}
