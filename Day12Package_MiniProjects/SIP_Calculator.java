package Day12Package_MiniProjects;

import java.util.Scanner;

public class SIP_Calculator {
    public static void main(String[] args) {
        int monthlyInvestment,timePeriod, investedAmount,estimatedReturns,totalValue;
        float returnRate, a, b, c, d ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your monthly investment");
        monthlyInvestment = sc.nextInt();
        System.out.println("Please enter your Time period in years only");
        timePeriod= sc.nextInt();
        System.out.println("Please enter your expected Return Rate");
        a = sc.nextFloat();
        returnRate = (a/12)/100;
        b = 1+ returnRate;
        c= (float) (Math.pow(b,(timePeriod*12)));
        System.out.println(c);
        d = (c-1)/returnRate;
        totalValue= (int) (monthlyInvestment * d * b);
        System.out.println("Your Total Value is " + totalValue);
        investedAmount = monthlyInvestment * (timePeriod * 12);
        System.out.println("Your Invested Amount is " + investedAmount);
        estimatedReturns = totalValue - investedAmount;
        System.out.println("Your Estimated Returns are " + estimatedReturns);
    }
}
