package chapter11_hold_the_object;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 第11章 持有对象
 * 练习27
 *
 * @author hy
 * @date 2021-02-28
 */
public class Practice27
{
    public static void main(String[] args)
    {
        Method.operation(Init.init());
    }
}

class Method
{
    public static void operation(Queue<Command> queue)
    {
        while (queue.peek() != null)
        {
            System.out.println(queue.remove().getCommand() + "");
        }
    }
}

class Init
{
    public static Queue<Command> init()
    {
        Queue<Command> queue = new LinkedList<Command>();
        queue.offer(new Command("command 1"));
        queue.offer(new Command("command 2"));
        queue.offer(new Command("command 3"));
        queue.offer(new Command("command 4"));
        queue.offer(new Command("command 5"));
        queue.offer(new Command("command 6"));
        return queue;
    }
}

class Command
{
    private String command;

    public Command()
    {
    }

    public Command(String command)
    {
        this.command = command;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }

    @Override
    public String toString()
    {
        return "Command{" +
                "command='" + command + '\'' +
                '}';
    }
}
