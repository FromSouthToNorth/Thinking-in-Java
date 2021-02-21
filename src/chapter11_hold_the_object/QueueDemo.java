package chapter11_hold_the_object;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 第11章 持有对象
 *
 * Queue
 *
 * @author hy
 * @date 2021-02-18
 */
public class QueueDemo
{
    public static void printQ(Queue queue)
    {
        // peek() 和 element() 都是将在不移除的情况下返回列头，但是 peek() 方法在队列为空时返回 null，
        // 而 element() 会抛出 NoSuchElementException 异常。
        while (queue.peek() != null)
        {
            // poll() 和 remove() 方法将移除并返回队头，
            // 但poll() 在队列为空是返回 null
            // 而 remove() 会抛出 NoSuchElementException 异常
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
        {
            // offer() 方法是与 Queue 相关的方法之一，它在允许的情况下将下一个元素插入到队尾或者返回 false
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);

        Queue<Character> q = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
        {
            q.offer(c);
        }
        printQ(q);
    }
}
