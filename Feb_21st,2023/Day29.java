import java.util.*;
class Day29
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           Integer arr1[]=new Integer[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
            System.out.println("Enter the number of elements in the second array");
           int n2=sc.nextInt();
           Integer arr2[]=new Integer[n2];
            for(int i=0;i<n2;i++)
                    arr2[i]=sc.nextInt();
            Set<Integer> set=new HashSet<>();
            set.addAll(Arrays.asList(arr1));
            set.addAll(Arrays.asList(arr2));
            System.out.println(set);
    }
}