package Day11Package;
import java.util.Scanner;

enum Seasons{
    Winter, Summer, Rainy, Autumn, Spring
}

public class EnumWithSwitchCase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a season:");
        System.out.println("1. Spring");
        System.out.println("2. Summer");
        System.out.println("3. Autumn");
        System.out.println("4. Winter");
        System.out.println("5. Rainy");

        int choice = scanner.nextInt();

        Seasons selectedSeason;

        switch (choice) {
            case 1:
                selectedSeason = Seasons.Spring;
                break;
            case 2:
                selectedSeason = Seasons.Summer;
                break;
            case 3:
                selectedSeason = Seasons.Autumn;
                break;
            case 4:
                selectedSeason = Seasons.Winter;
                break;
            case 5:
                selectedSeason = Seasons.Rainy;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        switch (selectedSeason) {
            case Spring:
                System.out.println("It's Spring! Flowers are blooming.");
                break;
            case Summer:
                System.out.println("It's Summer! Enjoy the warm weather.");
                break;
            case Autumn:
                System.out.println("It's Autumn! Leaves are falling.");
                break;
            case Winter:
                System.out.println("It's Winter! Time for snow and cold weather.");
                break;
            case Rainy:
                System.out.println("It's Rainy! Time to carry an umbrella.");
                break;
        }
    }
}