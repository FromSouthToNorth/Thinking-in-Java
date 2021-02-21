package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 第11章 持有对象
 * <br />
 * 11.13.1 适配器方法管用法
 * <br />
 * 如果现有一个Iterable类，你想要添加一种或多种在foreach语句中使用这个类的方法，应该怎么做呢？
 * 例如，假设你希望可以选择以向前或者向后的方式迭代一个单词列表。
 * 如果直接继承这个类，并覆盖iterator()方法，只能替换现有方法而不是实现选择。
 * 一种解决方案是所谓的《适配器方法》的管用法。“适配器”部分来自于设计模式，因为必须提供特定的接口以满足foreach语句。
 * 当你有一个接口并需要另一个接口时，编写适配器就可以解决问题。
 * 这里，我希望在默认的前进迭代器的基础上，添加产生反向迭代器的能力，
 * 因此我不能使用覆盖，而是添加一个能够产生Iterable对象的方法，该对象可以使用foreach语句，
 * 正如所见，着是的我们可以提供多种使用foreach的方法:
 *
 * @see ArrayList
 * @see Iterable
 * @see Iterator
 * @author hy
 * @date 2021-02-21
 */
public class AdapterMethodIdiom
{
    public static void main(String[] args)
    {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>
                (Arrays.asList("To be or not be".split(" ")));
        // Grabs the ordinary iterator via iterable():
        // 通过iterable()抓取普通迭代器:
        // 如果直接将ral对象置于foreach语句中，将得到（默认的）向前迭代器。
        for (String s : ral)
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        // Hand it the Iterable of your choice
        // 给它你选择的迭代对象
        // 但是如果在该对象上调用reversed()方法，就会产生不同的行为。
        for (String s : ral.reversed())
        {
            System.out.print(s + ", ");
        }
    }
}

class ReversibleArrayList<T> extends ArrayList<T>
{
    public ReversibleArrayList(Collection<T> c)
    {
        super(c);
    }

    public Iterable<T> reversed()
    {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>()
                {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext()
                    {
                        return current > -1;
                    }

                    @Override
                    public T next()
                    {
                        return get(current --);
                    }

                    @Override
                    public void remove()
                    {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
