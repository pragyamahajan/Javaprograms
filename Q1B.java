package j1;
import java.util.*;
public class Q1B {
    public static void main(String args[]){
        long units;
        units=Long.parseLong(args[0]); //command line argument
        double bill=0;
        if(units<100)
            bill = units*1.20;

        else if(units<300)
            bill = 100*1.20+(units-100)*2;

        else if(units>300)
            bill = 100*1.20+200*2+(units-300)*3;

        System.out.print("bill is " + bill );

    }
}

