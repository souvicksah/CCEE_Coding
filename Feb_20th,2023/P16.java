import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;

        int a = num1;
        int b = num2;

        int i=2;
        while(i <= a/2 || i < b/2){
        //for(int i=2; i <= a/2 && i < b/2; i++){
            if(a % i == 0 && b % i == 0){
                gcd *= i;
                a /= i;
                b /= i;
                i = 2;
            } else {
                i++;
            }
        } 

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
