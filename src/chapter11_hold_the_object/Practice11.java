package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * 第11章 持有对象
 * 练习11：写一个方法，使用Iterator遍历Collection，并打印容器中每个对象的toString()。
 * 填充各种类型的Collection，然后对其使用此方法。
 *
 * @author hy
 * @date 2021-02-15
 */
public class Practice11
{
    public static void main(String[] args)
    {
        Collection<Object> collection = new ArrayList<Object>();
        collection.add(1);
        collection.add("hallo");
        collection.add(new Date());
        iterator(collection.iterator());
    }

    public static void iterator(Iterator<Object> iterator)
    {
        while (iterator.hasNext())
        {
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
