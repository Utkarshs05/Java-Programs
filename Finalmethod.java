public class Finalmethod
{
    class A
    {
        final void meth()
        {
            System.out.println("This is a final class.");
        }
    }
    class B extends A
    {
        void meth()
        {
            System.out.println("Illegal!");
        }
    }
    class finalmethod
    {
        public static void main (String args[])
        {
            B b = new B();
            b.meth();
        }
    }
}
