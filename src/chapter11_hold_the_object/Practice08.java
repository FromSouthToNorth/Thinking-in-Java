package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 第11章 持有对象
 * 练习8：修改练习1，以便调用hop()时使用Iterator变量List
 *
 * @author hy
 * @date 2021-02-15
 */
public class Practice08
{
    public static void main(String[] args)
    {
        List<Gerbil> gerbils = new ArrayList<Gerbil>(Arrays.asList(
                new Gerbil(1, "跳跃"),
                new Gerbil(2, "飞跃"),
                new Gerbil(3, "弹跳"),
                new Gerbil(4, "横跳")));
        Practice08 practice08 = new Practice08();
        practice08.hop(gerbils.iterator());
    }

    public void hop(Iterator<Gerbil> iterator)
    {
        while (iterator.hasNext())
        {
            Gerbil gerbil = iterator.next();
            System.out.println(gerbil.getGerbilNumber() + " " + gerbil.getJump());
        }
    }
}
