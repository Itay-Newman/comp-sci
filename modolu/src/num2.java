import java.util.Scanner;

public class num2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a two-digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 10;
        int digit2 = number % 10;
        int sumOfDigits = digit1 + digit2;
        int flippedNumber = digit2 * 10 + digit1;

        System.out.println("The sum of the digits is: " + sumOfDigits + " and the flipped number is: " + flippedNumber);
    }
}