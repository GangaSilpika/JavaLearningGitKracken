package Day2Package;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        int a=60;
        System.out.println("Enter the number to be converted into seconds");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Seconds for the given minutes converted are "+ (timeConversion(a,b)));
    }
    public static int timeConversion(int a, int b){
        return(a*b);
    }
}
