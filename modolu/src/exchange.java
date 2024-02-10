
import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dollar amount:" );
        double dollarAmount = scanner.nextInt();
        double conversionRate = 3.77;
        double x = conversionRate * dollarAmount;
        System.out.println(dollarAmount + "in shekel is:" + x);


    }
}
