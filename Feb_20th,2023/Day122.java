import java.util.*;
import java.math.*;
class Day122
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the range");
          int n=sc.nextInt();
          System.out.println("prime number 2");
          for(int i=3;i<=n;i=i+2){
          if(checkprime(i))
               System.out.println("prime Number "+i);
          }
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