import java.util.*;
class Day125
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          if(checkperfect(n))
               System.out.println("Perfect Number");
          else
               System.out.println("Not a Perfect Number"); 
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