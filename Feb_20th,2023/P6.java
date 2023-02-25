//approach 3: swap two varibles with third variable

public class P6 {
    public static void main(String[] args) {

        int a = 111, b = 162;
        System.out.println("Before swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}

/*
 * 3) When we use pointers to variable and make a function swap, all the above
 * methods fail when both pointers point to the same variable. Let’s take a look
 * at what will happen in this case if both are pointing to the same variable.
 * 
 * // Bitwise XOR based method
 * x = x ^ x; // x becomes 0
 * x = x ^ x; // x remains 0
 * x = x ^ x; // x remains 0
 * // Arithmetic based method
 * x = x + x; // x becomes 2x
 * x = x – x; // x becomes 0
 * x = x – x; // x remains 0
 */