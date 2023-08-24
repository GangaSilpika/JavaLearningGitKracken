package Day3Package;
import java.util.Scanner;
public class RemainderOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        System.out.println("The remainder of your numbers is " + remainderOfTwoNumbers(dividend, divisor));
    }
    public static int remainderOfTwoNumbers(int dividend, int divisor)
    {
        return (dividend%divisor);
    }
}
