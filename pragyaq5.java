package j1;
import java.util.Scanner;
public class pragyaq5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();  //
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();  //
        System.out.print("Enter 3rd number: ");
        int c = in.nextInt();  //
        if (a == b && b == c)
        {
            System.out.println("Pragya All numbers are equal");
        }
        else if ((a == b) || (a == c) || (c == b))
        {
            System.out.println("Pragya Neither all are equal or different");
        }
        else
        {
            System.out.println("Pragya All numbers are different");
        }
    }
}

