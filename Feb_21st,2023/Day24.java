import java.util.*;
class Day24
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int sum=0;
           for(int i=0;i<n-1;i++)
           {
                   int j=sc.nextInt();
                   sum=sum+j;
            }
          System.out.println("Missing Number is : "+(n*(n+1)/2-sum));
    }
}