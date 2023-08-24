package Day2Package;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of your rectangle");
        int a = sc.nextInt();
        System.out.println("Enter breadth of your rectangle");
        int b = sc.nextInt();
        System.out.println("The perimeter of your rectangle is "+ (perimeter(a,b)));
        System.out.println("Execution completed");
    }
    public static int perimeter(int a, int b){
        return (2*(a+b));
    }
}
