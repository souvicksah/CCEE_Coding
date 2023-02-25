
//print digits of a given number
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {
            System.out.print(num % 10 + " ");
            num /= 10;
        }

    }
}
