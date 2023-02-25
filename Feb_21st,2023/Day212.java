import java.util.*;
class Day212
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
           System.out.println("Before reversing");
          for(int i=0;i<n1;i++)
                 System.out.println(arr1[i]);
          for(int i=0;i<n1/2;i++)
          {
                 arr1[i]=arr1[i]+arr1[n1-i-1];
                 arr1[n1-i-1]=arr1[i]-arr1[n1-i-1];
                 arr1[i]=arr1[i]-arr1[n1-i-1];
          }
          System.out.println("After reversing");
          for(int i=0;i<n1;i++)
                 System.out.println(arr1[i]);
           
    }
}