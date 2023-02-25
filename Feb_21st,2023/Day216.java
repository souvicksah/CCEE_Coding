import java.util.*;
class Day216
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
           System.out.println("Enter the number of times it needs to be rotated");
           int rotate=sc.nextInt();
           rotate=rotate%n1;
            System.out.println("Before Rotation");
           for(int i=0;i<n1;i++)
                  System.out.println(arr1[i]);
           int after[]=new int[n1];
           for(int i=0;i<n1;i++)
           {
                after[(i+rotate)%n1]=arr1[i];
           }
           System.out.println("After rotation");
           for(int i=0;i<n1;i++)
                  System.out.println(after[i]);

           
    }
}