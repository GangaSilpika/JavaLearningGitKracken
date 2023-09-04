package Day7Package;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastValue {
    public static void main(String[] args) {
        //Initializing all arrays
        int a[]=new int[4];
        int i;
        boolean b[] = new boolean[4];
        char c[] = new char[4];
        float f[]= new float[4];
        //Loading values from the user
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 4 integer values");
        for(i=0;i<4;i++)
            a[i] = sc.nextInt();
        System.out.println("Enter 4 boolean values");
        for(i=0;i<4;i++)
            b[i] = sc.nextBoolean();
        //System.out.println("Enter 4 character values");
        //for(i=0;i<4;i++)
        // c[i] = sc.next().charAt(i);
        System.out.println("Enter 4 float values");
        for(i=0;i<4;i++)
            f[i] = sc.nextFloat();
        //Printing all the arrays
        for(i=0;i<4;i++)
            System.out.println(a[i]);
        for(i=0;i<4;i++)
            System.out.println(b[i]);
        //for(i=0;i<4;i++)
          //  System.out.println(c[i]);
        for(i=0;i<4;i++)
            System.out.println(f[i]);
        System.out.println("The first value is " + a[0]);
        System.out.println("The last element is " + a[a.length-1]);
        i=0;
        while(i<4){
            System.out.println(a[i]);
            i++;
        }
    }
}