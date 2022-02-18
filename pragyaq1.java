package j1;
import java.util.*;
public class pragyaq1 {
    public static void main(String[] args) {
        double units, bill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of units used: ");
        units = sc.nextDouble();
        if (units < 100)
            bill = units * 1.20;

        else if (units < 300)
            bill = 100 * 1.20 + (units - 100) * 2;

        else if (units > 300)
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;

        System.out.print("bill is " + bill);
    }
}
