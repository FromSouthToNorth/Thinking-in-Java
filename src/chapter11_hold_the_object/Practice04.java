package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章持有对象
 * 11.4 容器的打印
 * 创建一个生成器类，它可以在每次调用其next()方法时，产生你由你最喜欢的电影的字符串构成的名字。
 * 在字符串列表中的电影名称用完之后，循环到这个字符列表的开始处。
 * 使用这个生成器来填充数组，ArrayList，LinkedList，HashSet，LinkedHashSet和TreeSet，然后打印每一个容器
 *
 * @author hy
 * @date 2021-02-14
 */
public class Practice04
{
    /**
     * Collection 生成器
     *
     * @param collection
     */
    public static void next(Collection<String> collection)
    {
        collection.add("青龙偃月刀");
        collection.add("唐人街3");
        collection.add("美国队长");
        collection.add("钢铁侠");
        for (String s: collection) {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        next(new ArrayList<String>());
        next(new LinkedList<String>());
        next(new HashSet<String>());
        next(new LinkedHashSet<String>());
        next(new TreeSet<String>());
    }
}
