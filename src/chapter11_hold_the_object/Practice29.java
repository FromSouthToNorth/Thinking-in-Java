package chapter11_hold_the_object;

import java.util.PriorityQueue;

/**
 * 第11章 持有对象
 *
 * 练习29：创建一个继承自Object的简单类，它不包含任何成员，展示你能不能将这个类的多个示例成功添加到一个PriorityQueue中。
 * 这个问题将在第17章中详细讲解
 *
 * @author hy
 * @date 2021-02-21
 */
public class Practice29
{
    public static void main(String[] args)
    {
        PriorityQueue<Clazz> clazzPQ = new PriorityQueue<Clazz>();

        for (int i = 0; i < 6; i++)
        {
            // Exception Clazz cannot be cast to java.lang.Comparable
            clazzPQ.offer(new Clazz());
        }

        while (clazzPQ.peek() != null)
        {
            System.out.println(clazzPQ.remove());
        }
    }
}

class Clazz {

}
