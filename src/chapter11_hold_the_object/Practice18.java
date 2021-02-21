package chapter11_hold_the_object;

import java.util.HashMap;
import java.util.Map;

/**
 * 第11章 持有对象
 * 练习18
 *
 * @author hy
 * @date 2021-02-18
 */
public class Practice18
{
    public static void main(String[] args)
    {
        char[] chars = new char[] {'a', 'b', 'e', 'c', 'd', 'f'};

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++)
        {
            map.put(chars[i], i + 1);
        }

        for (Character c : map.keySet())
        {
            System.out.println(map.keySet());
        }

    }
}
