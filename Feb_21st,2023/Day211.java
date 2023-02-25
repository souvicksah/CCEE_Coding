import java.util.*;
class Day211
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
          int i=0,j=n1-1;
          while(i<n1 && j>=0 && i!=j)
          {
               if(arr1[j]==0 && arr1[i]!=0)
               {
                  int temp=arr1[i];
                 arr1[i]=arr1[j];
                 arr1[j]=temp;
                 i++;
                 j--;
                }
               else if(arr1[j]==0 && arr1[i]==0)
                {
                      while(i<n1 && i<j && arr1[i]!=0)
                              i++;
                      if(i<n1){
                      int temp=arr1[i];
                      arr1[i]=arr1[j];
                      arr1[j]=temp;
                       i++;
                       j--;
                    }
                }
                else
                      j--;
              
           }
          for(i=0;i<n1;i++)
                 System.out.println(arr1[i]);
           
    }
}