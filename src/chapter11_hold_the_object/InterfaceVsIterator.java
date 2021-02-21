package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 *
 * 11.12 Collection和Iterator
 * Collection是描述所有有序容器的共性的根接口，它可能会被认为是一个“附属接口”，
 * 即因为要表示其他若干个接口的共性而出现的接口。
 * 另外，java.util.AbstractCollection类提供了Collection的默认实现，
 * 使得你可以创建AbstractCollection的子类型，而其中没有不必要的代码重复。
 *
 * @author hy
 * @date 2021-02-21
 */
public class InterfaceVsIterator
{
    public static void display(Iterator<Pet> it)
    {
        while (it.hasNext())
        {
            Pet p = it.next();
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets)
    {
        for (Pet p : pets)
        {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        List<Pet> list = new ArrayList<Pet>(
                Arrays.asList(new Pet("Mk"),
                        new Pet("Cat"),
                        new Pet("Dog"))
        );

        Set<Pet> set = new HashSet<Pet>(list);

        Map<String, Pet> map = new HashMap<String, Pet>();

        String[] names = ("Mk Cat Dog").split(" ");

        for (int i = 0; i < names.length; i++)
        {
            map.put(names[i], list.get(i));
        }
        display(list);
        display(set);
        display(list.iterator());
        display(set.iterator());
        System.out.println(map);
        System.out.println(map.keySet());
        display(map.values());
        display(map.values().iterator());
    }
}
