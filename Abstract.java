abstract class A 
{
    abstract void callme();
    void callmetoo()
    {
        System.out.println("This is a concrete method");
    }
}
class B extends A
{
    void callme()
    {
        System.out.println("This is A's abstract method");
    }
}
class Abstract
{
    public static void main(String args[])
    {
        B b = new B();
        b.callme();
        b.callmetoo;
    } 
}