package chapter11_hold_the_object;

import java.util.HashMap;
import java.util.Map;

/**
 * 第11章 持有对象
 *
 * @author hy
 * @date 2021-02-16
 */
public class PetMap
{
    public static void main(String[] args)
    {
        Map<String, Pet> petMap = new HashMap<String, Pet>();

        petMap.put("My Cat", new Pet("Cat"));
        petMap.put("My Dog", new Pet("Dog"));
        petMap.put("My Mouse", new Pet("Mouse"));

        System.out.println(petMap);

        // select value by key
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);

        // containsKey 是否包含某个 Key
        System.out.println(petMap.containsKey("My Mouse"));
        
        // containsValue 是否包含某个 Value
        Pet cat = petMap.get("My Cat");
        System.out.println(petMap.containsValue(cat));
    }
}

class Pet
{
    private String name;

    public Pet()
    {
    }

    public Pet(String name)
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
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
