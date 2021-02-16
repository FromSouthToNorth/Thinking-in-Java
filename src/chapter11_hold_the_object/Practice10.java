package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 第11章 持有对象
 * 练习10：修改第8章中的练习9，使其中使用一个ArrayList来存放Rodents，并使用一个Iterator来访问Rodents序列。
 *
 * @author hy
 * @date 2021-02-15
 */
public class Practice10
{
    public static void main(String[] args)
    {
        List<Rodents> rodents = new ArrayList<Rodents>();
        rodents.add(new Rodents());
        rodents.add(new Mouse());
        rodents.add(new Gerbil2());
        rodents.add(new Hamster());
        iterator(rodents.iterator());
    }

    public static void iterator(Iterator<Rodents> iterator)
    {
        while (iterator.hasNext())
        {
            Rodents rodents = iterator.next();
            rodents.method();
        }
    }
}

class Rodents
{
    /**
     * method
     */
    void method()
    {
        System.out.println("Rodents method");
    }
}

class Mouse extends Rodents
{
    @Override
    void method()
    {
        System.out.println("Mouse method");
    }
}

class Gerbil2 extends Rodents
{
    @Override
    void method()
    {
        System.out.println("Gerbil2 method");
    }
}

class Hamster extends Rodents
{
    @Override
    void method()
    {
        System.out.println("Hamster method");
    }
}
