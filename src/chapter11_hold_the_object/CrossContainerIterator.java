package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 * 创建一个 display() 方法，它不必知晓容器的确切类型
 *
 * @author hy
 * @date 2021-02-14
 */
public class CrossContainerIterator {
    public static void display(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 3, 2, 6, 5));
        LinkedList<Integer> linkedList = new LinkedList<Integer>(list);
        HashSet<Integer> hashSet = new HashSet<Integer>(list);
        TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(list);

        display(list.iterator());
        display(linkedList.iterator());
        display(hashSet.iterator());
        display(treeSet.iterator());
        display(linkedHashSet.iterator());
    }
}
