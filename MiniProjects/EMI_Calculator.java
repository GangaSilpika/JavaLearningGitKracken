package MiniProjects;

import java.util.Scanner;

public class EMI_Calculator {
    public static void main(String[] args) {
        int  LoanAmount, Tenure, EMI, InterestAmount, TotalAmount;
        double a,b,c,d,e;
        float RateOfInterest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your loan amount");
        LoanAmount = sc.nextInt();
        System.out.println("Please enter your Tenure in months only");
        Tenure = sc.nextInt();
        System.out.println("Please enter your Rate of Interest for the loan");
        a = sc.nextFloat();
        RateOfInterest = (float) ((a/12)/100);
        b = 1+RateOfInterest;
        c = Math.pow(b,Tenure);
        d = LoanAmount * RateOfInterest;
        e = c / (c-1);
        EMI = (int) (d*e);
        System.out.println("Your monthly EMI is " + EMI);
        System.out.println("Your Principle amount is " + LoanAmount);
        TotalAmount = EMI*Tenure;
        System.out.println("Your Total Amount is " + TotalAmount);
        InterestAmount = TotalAmount-LoanAmount;
        System.out.println("Interest Amount is " + InterestAmount);
    }
}
