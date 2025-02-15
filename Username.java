import java.util.Scanner;

class main
{
    public static void main (String args[])
    {
        @SuppressWarnings("resource")
        Scanner myobj = new Scanner (System.in);
        String Username;
        System.out.println("Enter Username: ");
        Username = myobj.nextLine();
        System.out.println("username is: "+Username);
    }
}