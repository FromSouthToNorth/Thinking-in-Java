package 第12章_通过异常处理错误;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 第12章_通过异常处理错误
 * 练习6
 *
 * @author
 * @date 2021-03-03
 */
public class Practice06
{
    public static void main(String[] args)
    {
        try
        {
            throw new Exception1();
        }
        catch (Exception1 e)
        {
            e.printStackTrace(System.out);
        }

        try
        {
            throw new Exception2();
        }
        catch (Exception2 e)
        {
            e.printStackTrace(System.out);
        }
    }
}

class Exception1 extends Exception
{
    Logger logger = Logger.getLogger("Exception1");

    Exception1()
    {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Exception2 extends Exception
{
    Logger logger = Logger.getLogger("Exception2");

    Exception2()
    {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}