// factors of a given number
public class P11 {
    public static void main(String[] args) {
        int num = 72;
        System.out.print("Factors of " + num + ": 1 ");
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
        System.out.println(num);
    }
}
