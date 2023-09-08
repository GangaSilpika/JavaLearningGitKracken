package Day9Package;

public class ThrowsExample {
    public static void example() throws IllegalAccessException {
        System.out.println("In example");
        throw new IllegalAccessException("inside example");
    }

    public static void main(String[] args) {
        try {
            example();
        } catch (IllegalAccessException a) {
            System.out.println("Main program");
        }
    }
}