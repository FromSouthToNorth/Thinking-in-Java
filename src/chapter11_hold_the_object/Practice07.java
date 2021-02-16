package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第11章 持有对象
 * 练习7：创建一个类，然后创建一个用你的类的对象进行过初始化的数组。
 * 通过使用 subList()方法，创建你的list的子集，然后在你的List中移除这个子集
 *
 * @author hy
 * @data 2021-02-14
 */
public class Practice07
{
    static class Pet
    {
        private Long id;

        private String name;

        public Long getId()
        {
            return id;
        }

        public void setId(Long id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public Pet()
        {
        }

        public Pet(Long id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "Pet{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args)
    {
        Pet[] pets = new Pet[]{
                new Pet(1L, "dog"),
                new Pet(2L, "cat"),
                new Pet(3L, "mouse")};

        List<Pet> list = new ArrayList<Pet>(Arrays.asList(pets));
        System.out.println("list: " + list);

        List<Pet> sub = list.subList(1, 3);
        System.out.println("sub: " + sub);

        list.removeAll(sub);
        System.out.println("removeAll: " + list);
    }
}
