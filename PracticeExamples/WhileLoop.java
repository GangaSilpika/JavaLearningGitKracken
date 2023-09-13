package PracticeExamples;

public class WhileLoop {
    public static void main(String[] args) {
        int x  = 0;
        System.out.println("while Loop:");
        while(x<6){
            System.out.println(x);
            x++;
        }
        x=0;
        System.out.println("do - while Loop:");
        do{
            System.out.println(x);
            x++;
        }while(x<6);
        System.out.println("for Loop:");
        for(x=0;x<6;x++)
            System.out.println(x);
    }
}
