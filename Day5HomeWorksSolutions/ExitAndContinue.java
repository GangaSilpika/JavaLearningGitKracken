package Day5HomeWorksSolutions;

import static java.lang.System.exit;

public class ExitAndContinue {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        for (m = 1; m < 11; m++) {
            for (n = 1; n < 6; n++) {
                if (m == 4) {
                    break;
                }
                System.out.println(m * n);
            }
        }
    }
}

