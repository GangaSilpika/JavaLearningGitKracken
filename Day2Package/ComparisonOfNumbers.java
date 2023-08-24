package Day2Package;

import java.util.Scanner;

public class ComparisonOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter your First number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter your Second number");
        int y = sc.nextInt();
        System.out.print("The result is "+ (comparisonOfNumbers(x,y)));
    }
    public static boolean comparisonOfNumbers(int x, int y){
        return (x==y?true:false);
    }
}

