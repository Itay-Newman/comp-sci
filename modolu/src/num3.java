import java.util.Scanner;

public class num3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = number / 10 % 10;
        int digit3 = number % 10;
        int sumOfDigits = digit1 + digit2 + digit3;
        int flippedNumber = digit3 * 100 + digit2 * 10 + digit1;

        System.out.println("The sum of the digits is: " + sumOfDigits + " and the flipped number is: " + flippedNumber);
    }
}