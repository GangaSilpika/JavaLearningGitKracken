package Day9Package;

public class CustomException
{
    public static void main(String[] args) {
        try{
            int i[] = {3,4};
            System.out.println(i[3]);
        } catch (Exception notequal) {
            System.out.println("Customexception : i value is 3");
        }
    }
}
