import java.util.*;
class Day26
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
            System.out.println("Enter the number of elements in the second array");
           int n2=sc.nextInt();
           int arr2[]=new int[n2];
            for(int i=0;i<n2;i++)
                    arr2[i]=sc.nextInt();
            int i=0,j=0;
            while(i<arr1.length && j<arr2.length)
            {
                 if(arr1[i]==arr2[j]){
                        System.out.println(arr1[i]); 
                        i++;
                         j++;
                  }
                 else if(arr1[i]>arr2[j])
                            j++;
                 else
                         i++;
            }
             
    }
}