package 第12章_通过异常处理错误;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 第12章_通过异常处理错误
 * 练习7
 *
 * @author
 * @date
 */
public class Practice07
{
    static Logger logger = Logger.getLogger("Practice07");

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
            StringWriter trace = new StringWriter();
            e.printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
    }
}
