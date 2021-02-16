package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 * 11.9 Set
 *
 * Set不保存重复的 Element
 *
 * @author hy
 * @date 2021-02-16
 */
public class SetOfInteger
{
    public static void main(String[] args)
    {
        Random rand = new Random(47);
        Set<Integer> intSet = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++)
        {
            intSet.add(rand.nextInt(30));
        }
        System.out.println(intSet);
    }
}
