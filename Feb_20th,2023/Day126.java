import java.util.*;
class Day126
{
    public static void main(String []args)
    {
          for(int i=1;i<=1000;i++)
          {
                 if(checkperfect(i))
                {
                     System.out.println("Perfect Number"+i);
                }
          }
    }
    static boolean checkperfect(int n)
    {
         int sum=0;
         int temp=n;
         for(int i=1;i<=n/2;i++)
         {
                if(n%i==0)
                {
                      sum+=i;
                }
         }
         if(temp==sum)
         {
              return true;
         }
       return false;
     }
}