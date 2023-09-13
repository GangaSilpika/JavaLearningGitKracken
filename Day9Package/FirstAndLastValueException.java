package Day9Package;

import java.util.Scanner;

public class FirstAndLastValueException {
    public static void main(String[] args) {
        try{
            FirstLastValue();
        } catch (ArrayIndexOutOfBoundsException c){
            System.out.println("Accessing element out of Array");
        }
    }
    public static void FirstLastValue() throws ArrayIndexOutOfBoundsException{
        int a[]=new int[4];
        int i;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 4 integer values");
        for(i=0;i<4;i++)
            a[i] = sc.nextInt();
        for(i=0;i<4;i++)
            System.out.println(a[i]);
        System.out.println("The first value is " + a[0]);
        System.out.println("The last element is " + a[a.length-1]);
        System.out.println(a[a.length]);
    }
}
