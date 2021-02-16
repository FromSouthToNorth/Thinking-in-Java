package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 第11章 持有对象
 * 11.6 迭代器
 *
 * @author hy
 * @date 2021-02-14
 */
public class SimpleIterator
{
    public static void main(String[] args)
    {
        List<Practice07.Pet> pets = new ArrayList<Practice07.Pet>(Arrays.asList(
                new Practice07.Pet(1L,"dog"),
                new Practice07.Pet(2L, "cat"),
                new Practice07.Pet(3L, "mouse")));
        Iterator<Practice07.Pet> iterator = pets.iterator();
        // hasNext() 判断是否还有下一个 Elements
        while (iterator.hasNext())
        {
            // next() 下一个 Elements
            Practice07.Pet pet = iterator.next();
            System.out.println(pet.getId() + ": " + pet.getName() + " ");
        }
        System.out.println("---------------------");
        for (Practice07.Pet pet: pets)
        {
            System.out.println(pet.getId() + ": " + pet.getName() + " ");
        }
        iterator = pets.iterator();
        for (int i = 0; i < 3; i++)
        {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
    }
}
