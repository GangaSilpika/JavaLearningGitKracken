package Day3Package;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the base length of your triangle");
        int base = sc.nextInt();
        System.out.println("Please enter the first side length of your triangle");
        int sidelength1 = sc.nextInt();
        System.out.println("Please enter the second side length of your triangle");
        int sidelength2 = sc.nextInt();
        System.out.println("The perimeter of the given triangle is "+ trainglePerimeter(base,sidelength1,sidelength2));
    }
    public static int trainglePerimeter(int base, int sidelength1,int sidelength2){
        return (base+sidelength1+sidelength2);
    }
}
