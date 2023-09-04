package Day7Package;

import java.util.Scanner;

public class ArrayOfMultiples {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter the multiplier and multiplicand values");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        arrOfMultiples(i, j);
    }

    public static void arrOfMultiples(int i, int j) {
        int l,k;
        int a[] = new int[j];
        for (l = 1; l <= j; l++)
            {
                k=l-1;
                a[k] = i * l;
                System.out.println(a[k]);
            }
        }
    }


