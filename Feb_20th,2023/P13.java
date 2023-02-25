// smallest among three without using < or > operator

public class P13 {
    // this method doesnt work for negative numbers
    public static void main1(String[] args) {
        int a = 30, b = -8, c = 0;
        int smallest = 0;
        while (a != 0 && b != 0 && c != 0) {
            a--;
            b--;
            c--;
            smallest++;
        }

        System.out.println("Smallest number is " + smallest);
    }

    // this method works for negative numbers also. Chance of divide by zero exception
    public static void main(String[] args) {
        int a = 30, b = -8, c = 10;
        int smallest = a / b == 0 ? a / c == 0 ? a : c : b / c == 0 ? b : c;

        System.out.println("Smallest number is " + smallest);
    }
}
