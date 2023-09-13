package Day12Package_MiniProjects;

import java.util.Scanner;

public class EMI_Calculator {
    public static void main(String[] args) {
        int  loanAmount, tenure, EMI, interestAmount, totalAmount;
        double a,b,c,d,e;
        float rateOfInterest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your loan amount");
        loanAmount = sc.nextInt();
        System.out.println("Please enter your Tenure in months only");
        tenure = sc.nextInt();
        System.out.println("Please enter your Rate of Interest for the loan");
        a = sc.nextFloat();
        rateOfInterest = (float) ((a/12)/100);
        b = 1+rateOfInterest;
        c = Math.pow(b,tenure);
        d = loanAmount * rateOfInterest;
        e = c / (c-1);
        EMI = (int) (d*e);
        System.out.println("Your monthly EMI is " + EMI);
        System.out.println("Your Principle amount is " + loanAmount);
        totalAmount = EMI*tenure;
        System.out.println("Your Total Amount is " + totalAmount);
        interestAmount = totalAmount-loanAmount;
        System.out.println("Interest Amount is " + interestAmount);
    }
}
