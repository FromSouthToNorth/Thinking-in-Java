package chapter11_hold_the_object;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 第11章 持有对象
 *
 * 11.13 Foreach
 *
 * 到目前为止，foreach语法主要用于数组，但是它也可以应用于任何Collection对象。
 * 实际上已经看到过很多实用ArrayList是用到它的示例，下面是一个更通用的证明：
 *
 * @author hy
 * @date 2021-02-21
 */
public class ForEachCollection
{
    public static void main(String[] args)
    {
        // 由于cs是一个Collection，所以这段代码展示了能够以foreach一起工作是所以Collection对象的特性。
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));

        for (String s : cs)
        {
            System.out.print("'" + s + "' ");
        }
    }
}
