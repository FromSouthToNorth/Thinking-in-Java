package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 * 练习32: 按照MultiIterableClass示例，在NonCollectionSequence.java中添加reversed()
 * 和randomized()方法，并让NonCollectionSequence实现Iterable。
 * 然后在foreach语句中展示所有的使用方式。
 *
 * @author hy
 * @date 2021-02-21
 */
public class Practice32 extends PetSequence2
{
    /**
     * 倒序输出
     *
     * @return reversed Iterable
     */
    public Iterable<Pet> reversed()
    {
        return new Iterable<Pet>()
        {
            @Override
            public Iterator<Pet> iterator()
            {
                return new Iterator<Pet>()
                {
                    int current = pets.length - 1;
                    @Override
                    public boolean hasNext()
                    {
                        return current > -1;
                    }

                    @Override
                    public Pet next()
                    {
                        return pets[current--];
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
     * 随机输出
     *
     * @return randomized Iterable
     */
    public Iterable<Pet> randomized()
    {
        return new Iterable <Pet>()
        {
            @Override
            public Iterator<Pet> iterator()
            {
                List<Pet> list = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(list, new Random(47));
                return list.iterator();
            }
        };
    }

    public static void main(String[] args)
    {
        Practice32 practice32 = new Practice32();
        for (Pet p : practice32.reversed())
        {
            System.out.print(p + ", ");
        }
        System.out.println();
        for (Pet p : practice32.randomized())
        {
            System.out.print(p + ", ");
        }
        System.out.println();
        for (Pet p: practice32.pets)
        {
            System.out.print(p + ", ");
        }
    }
}

class PetSequence2
{
    protected Pet[] pets = {
            new Pet("Mk"),
            new Pet("Cat"),
            new Pet("Dog"),
            new Pet("Mouse"),
    };
}
