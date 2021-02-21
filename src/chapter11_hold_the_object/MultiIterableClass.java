package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 * 11.13.1 适配器方法惯用法
 *
 *
 * @author hy
 * @date 2021-02-21
 */
public class MultiIterableClass extends IterableClass
{
    public Iterable<String> reversed()
    {
        return new Iterable<String>()
        {
            @Override
            public Iterator<String> iterator()
            {
                return new Iterator<String>()
                {
                    int current = words.length - 1;

                    @Override
                    public boolean hasNext()
                    {
                        return current > -1;
                    }

                    @Override
                    public String next()
                    {
                        return words[current--];
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

    /**
     * 注意random()没有创建他自己的Iterator，而是直接返回被打乱的List中的Iterator。
     *
     * @return
     */
    public Iterable<String> randomized()
    {
        return new Iterable<String>()
        {
            @Override
            public Iterator<String> iterator()
            {
                List<String> shuffled =
                        new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args)
    {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed())
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        for (String s : mic.randomized())
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        // 从输出中可以看到，Collection.shuffle()方法没有影响到原来的数组，而只是打乱了shuffled中的引用。
        // 之所以这样，是因为randomized()方法用一个ArrayList将Arrays.asList()方法的结果包装了起来。
        for (String s : mic)
        {
            System.out.print(s + ", ");
        }
    }
}
