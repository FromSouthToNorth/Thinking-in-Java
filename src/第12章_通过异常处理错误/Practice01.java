package 第12章_通过异常处理错误;

/**
 * 第12章_通过异常处理错误
 * 练习1
 *
 * @author hy
 * @date 2021-03-02
 */
public class Practice01
{
    public static void main(String[] args)
    {

        try
        {
            throw new Exception("My Exception");
        }
        catch (Exception e)
        {
            e.printStackTrace(System.err);
        }
        finally
        {
            System.out.println("finally");
        }
    }
}
