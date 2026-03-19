import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double SUM = 0;
        int count = 0;
        while (true) {
            try {
                if (scanner.hasNextInt()) {
                    SUM += scanner.nextInt();
                    count++;
                } else break;
            } catch (InputMismatchException e) {
                break;
            }
        }
        long avg = (count == 0) ? 0 :Math.round(SUM / count);
        long sum  = Math.round(SUM);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}