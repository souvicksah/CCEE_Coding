// reverse of a number

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }

        System.out.println("Reverse of " + num + " is " + rev);
    }
}
