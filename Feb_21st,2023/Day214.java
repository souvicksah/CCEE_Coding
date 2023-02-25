import java.util.*;
class Day214
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
           if(n1>0){
           Arrays.sort(arr1);
           int max=0;
           int number=0;
           int prev=arr1[0];
            int prevcount=1;
           for(int i=1;i<n1;i++)
           {
                 if(arr1[i]==prev)
                {
                        prevcount++;
                 }
               else
              {
                       if(max<prevcount)
                      {
                            max=prevcount;
                            number=prev;
                       }
                    prev=arr1[i];
                    prevcount=1;
               }
           }
           System.out.println("Most Frequent number:" +number+" "+max+"times");
        }
    }
}