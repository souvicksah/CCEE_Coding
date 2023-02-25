import java.util.*;
class Day213
{
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of elements in the first array");
           int n1=sc.nextInt();
           int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
                    arr1[i]=sc.nextInt();
           
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<n1;i++)
          {
               map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
          }
          int max=0;
          int number=arr1[0]; 
          
          for(Map.Entry<Integer,Integer> entry:map.entrySet())
          {
                  if(entry.getValue()>max){
                           max=entry.getValue();
                           number=entry.getKey(); 
                  }
          }
           System.out.println("Most Frequent number:" +number);
        
    }
}