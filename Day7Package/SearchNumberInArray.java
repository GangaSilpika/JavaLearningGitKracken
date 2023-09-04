package Day7Package;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        int a[]= new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 integer values");
        for(i=0;i<5;i++)
            a[i]=sc.nextInt();
        System.out.println("Please enter a number within or out of array");
        int num = sc.nextInt();
        boolean isPresent = false;
        for(i=0;i<5;i++)
        {
            if(a[i] == num)
                isPresent = true;
        }
        if(isPresent)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
