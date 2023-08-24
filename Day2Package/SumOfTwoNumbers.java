package Day2Package;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int m=sc.nextInt();
        System.out.println("Enter your second number");
        int n=sc.nextInt();
        System.out.print("Your sum is "+ (sumOfTwoNumbers(m,n)));
    }
    public static int sumOfTwoNumbers (int m, int n){
        return m+n;
    }
}
