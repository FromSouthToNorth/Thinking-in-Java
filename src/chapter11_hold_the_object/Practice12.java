package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 第11章 持有对象
 * 练习12：创建并组装一个List<Integer>，然后创建第二个具有相同尺寸的List<Integer>，并使用ListIterator读取第一个List中的元素，
 * 然后再将它们以反序插入第二个列表中（你可能想探索该问题的各种不同的解决之道）
 *
 * @author hy
 * @date 2021-02-15
 */
public class Practice12 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> novelList = new ArrayList<Integer>();
//        for (int i = list.size() - 1; i >= 0 ; i--) {
//            novelList.add(list.get(i));
//        }
        ListIterator<Integer> li = list.listIterator(list.size());
        while (li.hasPrevious()) {
            novelList.add(li.previous());
        }
        System.out.println(novelList);
    }

}