import java.util.*;
class Pair{
  public int num1;
  public int num2;
  Pair(int n1,int n2)
  {
       num1=n1;
       num2=n2;
  }
}
class Day217
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
           int target=sc.nextInt();
           HashMap<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<n1;i++)
           {
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
           }
           Set<Pair> set=new HashSet<>();
           for(int i=0;i<n1;i++)
           {
                   if(map.containsKey(target-arr1[i]))
                   {
                         set.add(new Pair(arr1[i],target-arr1[i]));
                    }
           }
           for(Pair p:set)
           {
                System.out.println(p.num1+" "+p.num2);
           }
    }
}