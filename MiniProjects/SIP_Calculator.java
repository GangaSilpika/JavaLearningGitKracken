package MiniProjects;

import java.sql.Time;
import java.util.Scanner;

public class SIP_Calculator {
    public static void main(String[] args) {
        int MonthlyInvestment,TimePeriod, InvestedAmount,EstimatedReturns,TotalValue;
        float ReturnRate, a, b, c, d ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your monthly investment");
        MonthlyInvestment = sc.nextInt();
        System.out.println("Please enter your Time period in years only");
        TimePeriod = sc.nextInt();
        System.out.println("Please enter your expected Return Rate");
        a = sc.nextFloat();
        ReturnRate = (a/12)/100;
        b = 1+ ReturnRate;
        c= (float) (Math.pow(b,(TimePeriod*12)));
        System.out.println(c);
        d = (c-1)/ReturnRate;
        TotalValue= (int) (MonthlyInvestment * d * b);
        System.out.println("Your Total Value is " + TotalValue);
        InvestedAmount = MonthlyInvestment * (TimePeriod * 12);
        System.out.println("Your Invested Amount is " + InvestedAmount);
        EstimatedReturns = TotalValue - InvestedAmount;
        System.out.println("Your Estimated Returns are " + EstimatedReturns);
    }
}
