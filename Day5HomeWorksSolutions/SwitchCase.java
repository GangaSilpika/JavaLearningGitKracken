package Day5HomeWorksSolutions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp = sc.nextInt();
        if (temp < 53) {
            System.out.println("The temperature is cold");
        }
            else if(temp > 52 && temp < 86)
                System.out.println("The temperature is normal");
            else if (temp > 85 && temp < 96)
                System.out.println("The temperature is hot");
            else
            {
                System.out.println("The temperature is very hot");
            }
        }
    }