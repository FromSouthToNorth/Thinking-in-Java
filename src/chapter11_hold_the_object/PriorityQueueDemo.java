package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 * PriorityQueue
 *
 * 先进先出描述了最典型的队列规则。队列规则是指在给定一组队列中的元素的情况下确定下一个弹出队列的元素规则。
 * 先进先出声明的是下一个应该是等待时间最长的元素。
 *《优先级队列》声明下一个弹出元素是最需要的元素（具有最高的优先级）。
 *    例如，在飞机场，当飞机临近起飞时，这架飞机的乘客可以在办理登记手续时排到队头。如歌构建了一个消息系统，
 * 某些消息比其他消息更为重要，因而应该加快地的到处理，那么它们合适的到处理就与它们何时到达无关。
 * PriorityQueue 添加到了 Java SE5 中，是为了提供这种行为的一种自动实现。
 *
 * @author hy
 * @date 2021-02-20
 */
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // 声明一个 优先队列
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        // 实例一个随机数，并向构造器传递一个魔法值
        Random rand = new Random(47);

        for (int i = 0; i < 10; i++)
        {
            // offer() 方法是与 Queue 相关的方法之一，它在允许的情况下将下一个元素插入到队尾或者返回 false
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25));
        // a novel priorityQueue
        priorityQueue = new PriorityQueue<Integer>(list);
        QueueDemo.printQ(priorityQueue);

        // priorityQueue 构造器重载 初始容量，比较方法
        // 为了展示可以使用怎样的方法通过提供自己的Comparator对象来改变排序。
        priorityQueue = new PriorityQueue<Integer>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        // 可以看到，重复值是允许的，最小的值拥有最高的优先级（如果是 String，空格也可以算作值，并且比字母的优先级高）。
        QueueDemo.printQ(stringPQ);

        stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for (char c : fact.toCharArray())
        {
            charSet.add(c);
        }
        PriorityQueue<Character> charPQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(charPQ);

        charPQ = new PriorityQueue<Character>(charSet.size(), Collections.reverseOrder());
        charPQ.addAll(charSet);
        QueueDemo.printQ(charPQ);
    }
}
