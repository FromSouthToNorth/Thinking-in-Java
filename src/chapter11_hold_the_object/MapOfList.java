package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 *
 * @author hy
 * @date 2021-02-17
 */
public class MapOfList
{
    public static Map<Person, List<Pet>> map = new HashMap<Person, List<Pet>>();

    static {
        map.put(new Person("Molly"), new ArrayList<Pet>(Arrays.asList(
                new Pet("Mouse"),
                new Pet("Gerbil")
        )));
        map.put(new Person("My"), new ArrayList<Pet>(Arrays.asList(
                new Pet("Mouse"),
                new Pet("Gerbil")
        )));
        map.put(new Person("Jke"), new ArrayList<Pet>(Arrays.asList(
                new Pet("Mouse"),
                new Pet("Gerbil"),
                new Pet("666")
        )));
        map.put(new Person("Luxi"), new ArrayList<Pet>(Arrays.asList(
                new Pet("Mouse"),
                new Pet("Gerbil"),
                new Pet("777")
        )));
    }

    public static void main(String[] args)
    {
        System.out.println(" set: " + map.keySet());
        System.out.println(" values: " + map.values());
        for (Person p : map.keySet())
        {
            System.out.println(p + " has:");
            for (Pet pet : map.get(p))
            {
                System.out.println("  " + pet);
            }
        }
    }
}

class Person
{
    private String name;

    public Person()
    {
    }

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}