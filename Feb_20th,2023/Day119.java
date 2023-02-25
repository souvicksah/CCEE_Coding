import java.util.*;
import java.math.*;
class Day119
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
          int n=sc.nextInt();
          int temp=n;
          int newnum=0;
          while(temp!=0)
          {
               newnum=newnum*10+temp%10;
               temp=temp/10;
           }
           if(newnum==n)
                 System.out.println("Palindrome");
           else
                 System.out.println("Not a Plaindrome");
     }
}