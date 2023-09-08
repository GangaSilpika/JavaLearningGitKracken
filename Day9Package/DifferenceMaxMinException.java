package Day9Package;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceMaxMinException {
    public static void main(String[] args) {
        try {
         MaxMinDifference();
        }catch(ArrayIndexOutOfBoundsException b){
            System.out.println(" Accessing out of array element");
        }
    }
    public static void MaxMinDifference() throws ArrayIndexOutOfBoundsException {
            int i;
            int a[] = new int[5];
            int b[] = new int[5];
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers");
        for(i=0;i<5;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int differenceMaxMin;
        differenceMaxMin =a[a.length -1]-a[0];
        System.out.println("The difference between the maximum and minimum value of array is  "+differenceMaxMin);
        System.out.println(a[a.length]);
        }
    }