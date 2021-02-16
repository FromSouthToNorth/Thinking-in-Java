package chapter11_hold_the_object;

import java.util.Collection;
import java.util.HashSet;

/**
 * 第11章 持有对象
 * 11.2 基本概念
 * 修改 SimpleCollection.java, 使用Set来表示c
 *
 * @author hy
 * @date 2021-02-14
 */
public class Practice01
{
    public static void main(String[] args)
    {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
        {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.println(i);
        }
    }
}
