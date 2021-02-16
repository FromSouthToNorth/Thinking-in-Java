package chapter11_hold_the_object;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 第11章 持有对象
 * TerrSet
 *
 * @author hy
 * @date 2021-02-16
 */
public class SortedSetOfInteger
{
    public static void main(String[] args)
    {
        Random rand = new Random(47);
        Set<Integer> intSet = new TreeSet<Integer>();

        for (int i = 0; i < 10000; i++)
        {
            intSet.add(rand.nextInt(30));
        }

        System.out.println(intSet);
    }
}
