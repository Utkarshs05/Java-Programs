
import java.util.Scanner;


public class PersonDetails
{
    public static void main (String [] args)
    {
        @SuppressWarnings("resource")
        Scanner myobj = new Scanner (System.in);
        System.out.println("Enter name,age and salary: ");
        
        int name = myobj.nextInt();
        double salary = myobj.nextDouble();

        System.out.println("Name: " + name);
        String age = null;
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
} 