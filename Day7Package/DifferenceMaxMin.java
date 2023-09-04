package Day7Package;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceMaxMin {
    public static void main(String[] args) {
        int i;
        int a[]=  new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers");
        for(i=0;i<5;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int differenceMaxMin;
        differenceMaxMin = a[a.length - 1] - a[0];
        System.out.println("The difference between the maximum and minimum value of array is  " + differenceMaxMin);
    }
}
