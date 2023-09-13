import java.io.FileNotFoundException;
import java.io.IOException;

public class Day9Class {
    public static void main(String[] args) {
        int a[] = new int[4];
        try {
            for (int i = 0; i < 5; i++)
                System.out.println(a[i]  + " ");
        } catch (Throwable accessing)
        {
            System.out.println("Accessing element out of length");
        }
    }
}
