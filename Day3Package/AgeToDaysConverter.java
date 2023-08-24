package Day3Package;

import java.util.Scanner;

public class AgeToDaysConverter {
    public static void main(String[] args) {
        System.out.println("Enter your Age in years only");
        Scanner sc  = new Scanner(System.in);
        int G_age= sc.nextInt();
        System.out.println("Your  age in number of days is "+ ageToDaysConverter(G_age));
    }
    public static int ageToDaysConverter(int G_age){
        return(365*G_age);
    }
}
