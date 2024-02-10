import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be debited: ");
        double amount = scanner.nextDouble();
        double amountToBePaid = calculateAmountToBePaid(amount);
        System.out.println("The amount to be paid is: " + amountToBePaid);
    }

    public static double calculateAmountToBePaid(double amount) {
        int roundedAmount = (int) (amount * 100);
        double amountToBePaid = roundedAmount / 100.0;
        if (roundedAmount % 100 >= 50) {
            amountToBePaid += 0.01;
        }
        return amountToBePaid;
    }
}