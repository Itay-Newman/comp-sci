import java.util.*;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days to check:");
        int days = scanner.nextInt();

        int countOutliers = 0;
        int sum = 0;
        int negative = 0;
        int r = 0;

        for (int i = 0; i < days; i++) {
            r = (int) (Math.random() * (100 - (-200)) - 200);
            if (r > 36 || r < -13) {
                countOutliers++;
            }
            if(r < 0)
            {
                negative++;
            }
            sum += r;
        }
        sum = sum / r;
        System.out.println("Average: " + sum);
        System.out.println("Number of outliers: " + countOutliers);
        System.out.println("numbers under zero: " + negative);
    }
}
