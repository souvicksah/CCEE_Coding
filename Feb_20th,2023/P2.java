//factorial of a gicen number
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;
        for(int i=2; i<=num; i++){
            fact *= i;
        }

        System.out.println("Factorial is " + fact);

        

    }
}
