package chapter11_hold_the_object;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * 第11章 持有对象
 *
 * 练习28：用由java.util.Random创建的Double值填充一个PriorityQueue（用offer()方法），然后用poll()移除并显示它们。
 *
 * @author hy
 * @date 2021-02-21
 */
public class Practice28
{
    public static void main(String[] args)
    {
        Random rand = new Random(47);

        PriorityQueue<Double> doublePQ = new PriorityQueue<Double>();

        for (int i = 0; i < 10; i++)
        {
            doublePQ.offer(rand.nextDouble());
        }

        while (doublePQ.peek() != null)
        {
            System.out.println(doublePQ.poll());
        }
    }
}
