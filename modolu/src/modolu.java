import java.util.Scanner;

public class modolu{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.println("The size of the rectangle is: " + calculateRectangleSize(length, width));
        System.out.println("The perimeter of the rectangle is: " + calculateRectanglePerimeter(length, width));
    }

    public static int calculateRectangleSize(int length, int width) {
        return length * width;
    }

    public static int calculateRectanglePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}