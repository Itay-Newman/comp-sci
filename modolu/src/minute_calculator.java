import java.util.Scanner;

public class minute_calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        int totalMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println("The number of minutes and seconds is: " + totalMinutes + " minute(s) and " + remainingSeconds + " second(s)");
    }
}