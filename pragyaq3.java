package j1;
import java.util.*;
public class pragyaq3 {
    public static void main(String args[]){
        long match,ings,notout,runs;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of matches played :");
        match = sc.nextLong();
        while(true){
            System.out.print("Enter no of ings batted :");
            ings = sc.nextLong();
            if(ings<match)
                break;
        }
        while(true){
            System.out.print("Enter no. of times player is notout :");
            notout = sc.nextLong();
            if(notout<ings)
                break;
        }
        System.out.print("Enter no. of runs :");
        runs = sc.nextLong();
        if(ings==notout)
            avg=runs;
        else
            avg=runs/(ings-notout);
        System.out.println("Batting average is "+avg);
    }
}