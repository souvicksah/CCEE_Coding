import java.util.*;
import java.math.*;
class Day117
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the first number");
          int n1=sc.nextInt(); 
         System.out.println("Enter the second number");
          int n2=sc.nextInt();
         if(n2>n1)
         {
              int temp=n2;
              n2=n1;
              n1=temp;
         }
        System.out.println(gcd(n1,n2)*(n1/gcd(n1,n2))*(n2/gcd(n1,n2)));
          
     }
    public static int gcd(int n1,int n2)
    {
           if(n1%n2==0)
                  return n2;
            return gcd(n2,n1%n2);
    }
}