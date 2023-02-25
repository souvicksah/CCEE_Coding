//factorial using recursion

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The factorial is : " + getFactorial(num));

    }    

    public static int getFactorial(int num){
        if(num <= 1) return 1;

        return num * getFactorial(num-1);
    }
}
