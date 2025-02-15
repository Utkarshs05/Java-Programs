public class Overloading {
    class A
    {
        int i,j;
        A(int a,int b)
        {
            i = a;
            j = b;
        }
        void sum()
        {
            System.out.println(i + j);
        }
    }
    class B extends A
    {
        int k;
        B(int a,int b,int c)
        {
            super(a,b);
            k = c;
        }
        void sum()
        {
            System.out.println("Sum: "+(i+j+k));
        }
    }
    class Overloading
    {
        public static void main(String[] args)
        {
            B sub = new B(1,2,3);
            sub.sum();
        }
    }
}
