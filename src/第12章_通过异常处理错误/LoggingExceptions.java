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
public class LoggingExceptions
{
    public static void main(String[] args)
    {
        try
        {
            throw new LoggingException();
        }
        catch (LoggingException e)
        {
            System.err.println("Catch: "  + e);
        }
        try
        {
            throw new LoggingException();
        }
        catch (LoggingException e)
        {
            System.err.println("Catch: "  + e);
        }
    }
}

class LoggingException extends Exception
{
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException()
    {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}



