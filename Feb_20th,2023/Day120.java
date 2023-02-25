import java.util.*;
import java.math.*;
class Day120
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
          int n=sc.nextInt();
          int temp=n;
          Set<Integer> set=new HashSet<>();
          while(temp!=1 & temp%2==0)
          {
                    set.add(2);
               temp=temp/2;
          }
          //System.out.println("outside 2");
          for(int i=3;temp!=1;i=i+2)
         {
               while(temp%i==0 && temp!=0){
                        set.add(i); 
                        temp=temp/i;
               }
         }
        System.out.println(set);
     }
}