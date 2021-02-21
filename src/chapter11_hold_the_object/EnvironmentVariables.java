package chapter11_hold_the_object;

import java.util.Map;

/**
 * 第11章 持有对象
 * 11.13 Foreach与迭代器
 *
 * 在Java ES5中，大量的类都是Iterable类型，主要包括所有的Collection类 (但不包含各种Map)。
 * 例如，下面的代码可以显示所有的操作系统的变量:
 *
 * @author hy
 * @date 2021-02-21
 */
public class EnvironmentVariables
{
    public static void main(String[] args)
    {
        // System.getenv()返回一个Map,entrySet()产生一个由Map.Entry的元素构成的Set，并且这个Set是一个Iterable，因此它可以用于foreach循环。
        for (Map.Entry entry : System.getenv().entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
