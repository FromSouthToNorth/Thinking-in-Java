package chapter11_hold_the_object;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * 第11章 持有对象
 *
 * 11.12 Collection和Iterator
 *
 * @author hy
 * @date 2021-02-21
 */
public class CollectionSequence
    extends AbstractCollection<Pet>
{
    private final Pet[] pets = {
            new Pet("Mk"), new Pet("Cat"),
            new Pet("Dog"), new Pet("Mouse"),
    };

    @Override
    public Iterator<Pet> iterator()
    {
        return new Iterator<Pet>()
        {
            private int index = 0;

            @Override
            public boolean hasNext()
            {
                // 判断是否有下一个元素
                return index < pets.length;
            }

            @Override
            public Pet next()
            {
                // 下一个元素
                return pets[index++];
            }

            @Override
            public void remove()
            {
                // 不支持运行 Exception
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args)
    {
        CollectionSequence cs = new CollectionSequence();
        InterfaceVsIterator.display(cs);
        InterfaceVsIterator.display(cs.iterator());
    }
}
