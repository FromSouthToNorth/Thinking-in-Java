package 第12章_通过异常处理错误;

/**
 * 第12章_通过异常处理错误
 * 练习3
 *
 * @author hy
 * @date 2021-03-02
 */
public class Practice03
{
    public static void main(String[] args)
    {
        int[] intArray = new int[5];
        int length = 6;
        try
        {
            for (int i = 0; i < length; i++)
            {
                intArray[i] = i;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace(System.err);
        }
    }
}
