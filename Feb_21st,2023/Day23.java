import java.util.*;
class Day23
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
          {
               arr[i]=sc.nextInt();
           }
          PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
            if(arr.length>0)
                 pq.add(arr[0]);
          for(int i=1;i<arr.length;i++)
          {
                  if(!pq.contains(arr[i])){
                            pq.add(arr[i]);
                  }
                if(pq.size()>2){
                      pq.poll();
                 }
          }
           if(pq.size()==2){
                   System.out.println(pq.peek());
            }
           else
                   System.out.println("No Second Minimum");
    }
}