package j1;
import java.util.Scanner;
public class pragyaq2 {
    public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a character: ");
            char x = sc.nextLine().charAt(0);
            if (x=='a' || x=='e' ||  x=='i' ||  x=='o' ||  x=='u' ){
                System.out.print(x+ " is a vowel");
            }
            else{
                System.out.print(x+ " is a constant");
            }
        }
    }

