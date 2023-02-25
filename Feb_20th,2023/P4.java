//approach 1: swap two varibles with third variable

public class P4 {
    public static void main(String[] args) {

        int a = 33, b = 62;
        System.out.println("Before swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}

/*
 * 1) The multiplication and division-based approach doesn’t work if one of the
 * numbers is 0 as the product becomes 0 irrespective of the other number.
 * 2) Both Arithmetic solutions may cause an arithmetic overflow. If x and y are
 * too large, addition and multiplication may go out of the integer range.
 * 
 */
