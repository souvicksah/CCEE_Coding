import java.util.*;
import java.math.*;
class Day118
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the first number");
          int num1=sc.nextInt(); 
         System.out.println("Enter the second number");
          int num2=sc.nextInt();
         if(num2>num1)
         {
              int temp=num2;
              num2=num1;
              num1=temp;
         }
        int n1=num1;
        int n2=num2;
         int lcm=1;
        while(num1%2==0 && num2%2==0 && num1>1 && num2>1)
       {
               lcm=lcm*2;
               num1/=2;
               num2/=2;
       }
       for(int i=3;num1>1 && num2>1;i=i+2)
       {
                /*if((num1%i==0 && num2%i!=0)||(num1%i!=0 && num2%i==0))
                               break;*/
                if(i>num1 || i>num2)
                       break;
                while(num1%i==0 && num2%i==0 && num1>1 && num2>1)
               {
                    lcm=lcm*i;
                    num1/=i;
                   num2/=i;
               }
       }
       int t=lcm;
      lcm=lcm*(n1/t)*(n2/t);
      System.out.println("LCM is "+lcm);
          
     }
    
}