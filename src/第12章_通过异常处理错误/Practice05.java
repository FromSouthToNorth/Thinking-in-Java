package 第12章_通过异常处理错误;

/**
 * 第12章_通过异常处理错误
 * 练习5
 *
 * @author hy
 * @date 2021-03-02
 */
public class Practice05
{
    public static void main(String[] args)
    {
        int length = 18;
        int[] ints = new int[6];


        while (length > ints.length)
        {
            try
            {
                ints[length] = length --;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                e.printStackTrace(System.err);
            }
        }
    }
}
