package 第12章_通过异常处理错误;

import java.util.List;

/**
 * 第12章_通过异常处理错误
 * 练习8
 *
 * @author
 * @date 2021-0307
 */
public class Practice08
{
    public static List<Integer> getList() throws NullPointerException
    {
        return null;
    }

    public static void main(String[] args)
    {
        List<Integer> list = getList();
        list.add(1);
    }
}
