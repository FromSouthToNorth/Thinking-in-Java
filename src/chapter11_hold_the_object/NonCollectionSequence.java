package chapter11_hold_the_object;

import java.util.Iterator;

/**
 * 第11章 持有对象
 *
 * 如果实现了Collection，就必须实现iterator()，并且只拿实现iterator()于继承AbstractCollection相比，
 * 话费的代价略微减少。但是，如果你的泪以及继承了其他类，那么的就不能再继承AbstractCollection了。
 * 在这种情况下，要使用Collection，就必须实现接口中的所有方法。此时，继承并提供创建迭代器的能力就会显得容易的多。
 *
 * @author hy
 * @date 2021-02-21
 */
public class NonCollectionSequence extends PetSequence
{
    public Iterator<Pet> iterator()
    {
        return new Iterator<Pet>()
        {
            private int index = 0;
            @Override
            public boolean hasNext()
            {
                return index < pets.length;
            }

            @Override
            public Pet next()
            {
                return pets[index++];
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args)
    {
        NonCollectionSequence n = new NonCollectionSequence();
        InterfaceVsIterator.display(n.iterator());
    }
}

class PetSequence {
    protected Pet[] pets = {
            new Pet("Cat"), new Pet("Moues"), new Pet("Dog"), new Pet("Mk")
    };
}

