import java.util.*;
import java.math.*;
class Day121
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
          int n=sc.nextInt();
           if(n==2)
               System.out.println("prime number 2");
          else if(checkprime(n))
               System.out.println("prime Number "+n);
          else
                System.out.println("not a prime Number "+n);
               
          }
   
    static boolean checkprime(int n)
    {
         for(int i=2;i<=n/2;i++)
         {
              if(n%i==0)
                     return false;
         }
         return true;
     }
}