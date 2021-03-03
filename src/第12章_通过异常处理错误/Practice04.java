package 第12章_通过异常处理错误;

/**
 * 第12章_通过异常处理错误
 * 练习4
 *
 * @author hy
 * @date 2021-03-02
 */
public class Practice04
{
    public static void main(String[] args)
    {
        try
        {
            throw new MyException("My exception");
        }
        catch (Exception e)
        {
            e.printStackTrace(System.err);
        }
    }
}

class MyException extends Exception
{
    private String message;

    @Override
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public MyException()
    {
    }

    public MyException(String message)
    {
       this.message = message;
    }

    public MyException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public MyException(Throwable cause)
    {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString()
    {
        return "MyException{" +
                "message='" + message + '\'' +
                '}';
    }
}
