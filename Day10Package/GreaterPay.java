package Day10Package;

public class GreaterPay {
    public static void main(String[] args){
        Employee silpika  = new Employee("Silpika", 120000, "A00001", 8 );
        Employee nafi = new Employee("Nafi", 130000, "A00002", 9);
        Employee jimmy = new Employee("Jimmy", 13000, "A00003");
        Employee ravi = new Employee("A00004", "Ravi");
        if(silpika.salary> nafi.salary)
            System.out.println("Silpika has greater pay");
        else{
            System.out.println("Nafi has greater pay");
        }
        jimmy.setExperience(6);
        System.out.println(jimmy.getExperience());
    }
}