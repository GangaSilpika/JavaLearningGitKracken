package Day6Package;

import java.util.Scanner;

public class BasketballGame {
    public static void main(String[] args) {
        int t_pointers;
        int h_pointers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two pointers score of the game");
        t_pointers =  sc.nextInt();
        System.out.println("Enter three pointers score of the game");
        h_pointers = sc.nextInt();
        basketballGame(t_pointers,h_pointers);
        }
    public static void basketballGame(int t_pointers, int h_pointers){
        System.out.println("Final points of the game are " + ((t_pointers*2)+(h_pointers*3)));
    }
}
