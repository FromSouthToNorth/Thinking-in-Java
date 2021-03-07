package 第12章_通过异常处理错误;

/**
 * 第12章_通过异常处理错误
 * 练习9
 *
 * @author
 * @date 2021-03-07
 */
public class Practice09
{
    public static void main(String[] args)
    {
        try
        {
            throw new RuntimeException("RuntimeException");
        }
        catch (RuntimeException e)
        {
            System.out.println("Caught RuntimeException: ");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizeMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("printStackTrace(): ");
            e.printStackTrace(System.out);
        }

        try
        {
            throw new NullPointerException("NullPointerException");
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught RuntimeException: ");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizeMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("printStackTrace(): ");
            e.printStackTrace(System.out);
        }

        try
        {
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught RuntimeException: ");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizeMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("printStackTrace(): ");
            e.printStackTrace(System.out);
        }
    }
}
