// sum of digits of a given number
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            int ld = num % 10;
            sum += ld;
            num /= 10;
        }

        System.out.println("Sum of the digits are " + sum);
    }
}
