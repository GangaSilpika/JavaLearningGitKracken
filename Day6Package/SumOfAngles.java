package Day6Package;

import java.util.Scanner;

public class SumOfAngles {
    public static void main(String[] args) {
        int sides;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides in the polygon");
        sides = sc.nextInt();
        sumOfAngles(sides);
        }
public static void sumOfAngles(int sides){
        System.out.println("Sum of internal angles for the polygon " + ((sides-2)*180));
}
}
