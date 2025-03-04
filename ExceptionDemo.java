class MyException extends Exception
{
    private int details;
    MyException(int a)
    {
        details = a;
    }
    public Object StringtoString()
    {
        return "MyException("+details+")";
    }
}
public class ExceptionDemo
{
    static void compute(int a) throws MyException
    {
        System.out.println("Called compute("+a+")");
        if(a>0)
        {
            throw new MyException(a);
        }
        System.out.println("Normal Exit");
    }

    public static void main (String [] args)
    {
        try
        {
            compute(1);
            compute(20);
        }
        catch (MyException e)
        {
            System.out.println("Caught " +e);
        }
    }
}
