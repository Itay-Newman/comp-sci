public class lol5 {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            }
        }
    }
}
