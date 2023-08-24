package Day4Package;

import java.util.Scanner;

public class MaximumEdgeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first length of your triangle");
        int low_val = sc.nextInt();
        System.out.println("Enter second length of your triangle");
        int high_val = sc.nextInt();
        if(low_val>high_val)
        {
            int temp = high_val;
            high_val=low_val;
            low_val=temp;
        }
        System.out.println("Enter the third length of your triangle");
        int third_val = sc.nextInt();
        if(third_val>high_val)
        {
            int  temp = third_val;
            third_val = high_val;
            high_val = temp;
        }
        System.out.println(high_val + " is your longest length of the triangle");
    }
}
