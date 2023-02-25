// leap year or not
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap year");
        }


    }
}
