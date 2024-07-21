import java.util.*;

public class age {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2023;
        int age = currentYear - birthYear;

        if (birthYear < 1907) {
            System.out.println("Congratulations, " + name + "! You are a world record holder for being the oldest person alive.");
            System.out.println("Your age is: " + age);
        } else {
            System.out.println("Hello, " + name + "! Your age is: " + age);
        }
    }
}