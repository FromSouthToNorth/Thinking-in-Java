package 第12章_通过异常处理错误;

import java.util.Date;

/**
 * 第12章_通过异常处理错误
 * 练习2
 *
 * @author hy
 * @date 2021-03-02
 */
public class Practice02
{
    public static void main(String[] args)
    {
        Date date = null;

        try
        {
            System.out.println(date.getTime());
        }
        catch (Exception e)
        {
            e.printStackTrace(System.err);
        }
    }
}
