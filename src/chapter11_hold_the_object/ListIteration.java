package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator
 *
 * @author hy
 * @date 2021-02-15
 */
public class ListIteration
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext())
        {
            // next() 下一个 Elements
            // nextIndex() 下一个索引
            // previousIndex() 前一个索引
            System.out.println(li.next() + " " + li.nextIndex() + " " + li.previousIndex() + ";");
        }
        System.out.println();

        // 倒序判断list尾部判断是否有上一个 Elements
        while (li.hasPrevious())
        {
            System.out.print(li.previous() + " ");
        }
        System.out.println();
        System.out.println(list);
        li = list.listIterator(3);
        while (li.hasNext())
        {
            li.next();
            li.set(1);
        }
        System.out.println(list);
    }
}
