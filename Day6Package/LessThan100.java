package Day6Package;

import java.util.Arrays;
import java.util.Scanner;

public class LessThan100 {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value less than 100");
        m = sc.nextInt();
       // if(m<0) {
        //    System.out.println("Please enter positive numbers only");
         //   m = sc.nextInt();
        //}// Can use WHILE loop for optimizing the coding
        while(m<0){
            System.out.println("Please enter positive numbers only");
            m = sc.nextInt();
        }
        System.out.println("Enter another value less than 100");
        n = sc.nextInt();
        if(n<0) {
            System.out.println("Please enter positive numbers only");
            n = sc.nextInt();
        }
        lessthan100(m, n);
        }

    public static void lessthan100(int m, int n) {
        /*if ((m + n) < 100) {
            System.out.println("True");
        } else
            System.out.println("False");*/
        System.out.println(((m+n)<100)?"True":"False");
    }
}