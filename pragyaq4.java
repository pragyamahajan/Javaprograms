package j1;//*package j1;
import java.util.Scanner;
public class pragyaq4 {
    public static void main(String[] args)
    {
        int i,j,n;
        System.out.print("enter number of rows : ");
        Scanner in = new Scanner(System.in);  //taking input
        n = in.nextInt();  //adding input in for-loop
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }
        System.out.println("This is Pragya's Number Right Triangle");
    }
}
