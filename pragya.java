package j1;
import java.util.Scanner;
public class pragya {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Please enter the number of students you want to enter: "); //takes an integer input
        String[] string = new String[name.nextInt()]; //consuming the <enter> from input above
        name.nextLine(); //branching
        for (int i = 0; i < string.length; i++) {
            string[i] = name.nextLine();
        }
        System.out.println("\nYou have entered: "); //for-each loop to print the string
        for (String str : string) {
            System.out.println(str);
        }
        System.out.println("\nEnter their Marks: ");

        // name.nextLine(); // branching
        for (int i = 0; i < string.length; i++) {
            string[i] = name.nextLine();
        }
        System.out.println("\nMarks scored by " + "(" + string.length + ") students are: "); //branched looping
        for (String str : string) {
            System.out.println(str);
        }
    }

}