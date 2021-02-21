package chapter11_hold_the_object;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 第11章 持有对象
 * 练习17
 *
 * @author hy
 * @date
 */
public class Practice17
{
    public static void main(String[] args)
    {
        Map<String, Gerbil> map = new HashMap<String, Gerbil>();

        map.put("JouYing", new Gerbil(1, "JouYing"));
        map.put("JouEr", new Gerbil(2, "JouEr"));
        map.put("JouSi", new Gerbil(3, "JouSi"));

        Set<String> set = map.keySet();

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            String key = iterator.next();
            Gerbil gerbil = map.get(key);
            System.out.println(gerbil);
            System.out.println(gerbil.getJump());
        }
    }
}
