import java.util.Scanner;

public class lol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int flippedNum = 0;
        for (int i = 0; num >= 1; i++) {
            int digit = num % 10;
            flippedNum = flippedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Flipped number: " + flippedNum);
    }
}
