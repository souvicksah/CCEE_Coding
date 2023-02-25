import java.util.*;
import java.math.*;
class Day123
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          if(checkarmstrong(n))
               System.out.println("Armstrong Number");
          else
               System.out.println("Not a Armstrong Number"); 
    }
    static boolean checkarmstrong(int n)
    {
         int temp=n; 
         int count=0;
         int sum=0;
        while(temp!=0)
        {
             count++;
             temp=temp/10;
        }
        temp=n;
        while(temp!=0)
        {
              sum+=Math.pow(temp%10,count);
              temp=temp/10;
         }
        if(sum==n)
              return true;
        return false;
     }
}