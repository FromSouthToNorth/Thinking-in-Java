package 第12章_通过异常处理错误;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 第12章_通过异常处理错误
 * 12.4.1 异常与记录日志
 *
 * @author hy
 * @date 2021-03-03
 */
public class LoggingExceptions2
{
    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e)
    {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args)
    {
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            logException(e);
        }
    }
}
