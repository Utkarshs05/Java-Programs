class A
{
    void msg()
    {
        System.out.println("Hello");
    }
}
class Protection
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.msg();
    }
}