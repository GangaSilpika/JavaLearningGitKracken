package Day5HomeWorksSolutions;

public class ControlFlowStatements {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<11;i++)
        {
            System.out.println(1+i);
        }
        while(i<20)
        {
            System.out.println(i*2);
            i++;
        }
        System.out.println((i>1)?"greater":"Lesser");
    }
}
