import java.util.*;
class Day311
{
    static String swappos(String s,int i,int j)
    {
          char[] arr=s.toCharArray();
          char temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          return String.valueOf(arr);
    }
    static void permutation(String s1,int beg,int end)
    {
            if(beg==end)
                 System.out.println(s1);
            else
            {
                  for(int i=beg;i<end;i++)
                 {
                       s1=swappos(s1,beg,i);
                       permutation(s1,beg+1,end);
                       s1=swappos(s1,beg,i);
                 }
            }
    }
    public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       permutation(s1,0,s1.length());
   }
}