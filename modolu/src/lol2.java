import java.util.Scanner;

public class lol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int numStudents = 30;
        int numPerfectGrades = 0;

        // Loop through each student
        for (int i = 1; i <= numStudents; i++) {
            // Get student's name
            System.out.print("Enter student " + i + "'s name: ");
            String name = scanner.next();

            // Get grades for three papers
            System.out.print("Enter grades for three papers for " + name + ": ");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();

            // Calculate average
            double average = (grade1 + grade2 + grade3) / 3.0;

            // Add 5 points if grade in third paper is higher than 85
            if (grade3 > 85) {
                average += 5;
            }

            // Cap final grade at 100 if it exceeds
            average = Math.min(100, average);

            // Check if final grade is perfect
            if (average == 100) {
                numPerfectGrades++;
            }

            // Display student's name and final grade
            System.out.println("Final grade for " + name + " is: " + average);
        }

        // Display number of students with perfect grades
        System.out.println("Number of students with perfect grades: " + numPerfectGrades);
    }
}
