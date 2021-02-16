package chapter11_hold_the_object;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 第11章 持有对象
 *
 * 11.10 Map
 *
 * 将映射到其他对象的能力是一种解决编程问题的杀手锏。
 * 例如，考虑一个程序，它将用来检查Java的Random类的随机性。理想状态下，Random可以将产生理想的数字分布，
 * 但要想测试它，则需要生成大量的随机数，并对落入各个不同范围的数字进行计数。
 * Map可以很容易地解决该问题。在本例中，建由Random产生数字，而值是该数字出现的次数：
 *
 * @author hy
 * @date 2021-02-16
 */
public class Statistics
{
    public static void main(String[] args)
    {
        Random rand = new Random(47);

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < 10000; i++)
        {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
