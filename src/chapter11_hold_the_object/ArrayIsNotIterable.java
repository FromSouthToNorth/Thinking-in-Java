package chapter11_hold_the_object;

import java.util.Arrays;

/**
 * 第11章 持有对象
 * 11.13 Foreach于迭代器
 *
 * foreach语句可以用于数组或其他Iterable，但这并不意味着数组肯定也是一个Iterable，
 * 而任何自动包装也不会自动发生:
 *
 * @author hy
 * @date 2021-02-21
 */
public class ArrayIsNotIterable
{
    static <T> void test(Iterable<T> ib)
    {
        for (T t : ib)
        {
            System.out.print(ib + " ");
        }
    }

    public static void main(String[] args)
    {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C" };
        // An array works in foreach. but is`s not Iterable:
        // 数组在foreach中是不可迭代的
        //! test(strings);
        // You must explicitly convert it to an Iterable:
        // 必须显式地将其转换为可迭代对象。尝试把数组当中Iterable参数传递会导致失败。
        // 这说明不存在任何从数组到Iterable的自动转换，必须手动执行这种转换
        test(Arrays.asList(strings));
    }
}
