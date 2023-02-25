import java.util.*;
class Day25
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
             Set<Integer> set1=new HashSet<>();
             for(int i=0;i<arr1.length;i++)
                       set1.add(arr1[i]);
             Set<Integer> set2=new HashSet<>();
             for(int i=0;i<arr2.length;i++)
                       set2.add(arr2[i]);
             for(int i:set1)
             {
                     if(set2.contains(i))
                               System.out.println(i);
              }            
    }
}