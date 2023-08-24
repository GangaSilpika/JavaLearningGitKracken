package Day4Package;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        nameGreeting(name);
    }

    public static void nameGreeting(String name) {
        System.out.println("Hello " + name + ".");
    }
}

