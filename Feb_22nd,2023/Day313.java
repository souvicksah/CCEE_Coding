import java.util.*;
class Day313
{
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         subset(s,1);
         /*for(int i=1;i<=s.length();i++)
         {
               for(int j=0;j<s.length()-i+1;j++)
               {
                    System.out.println(s.substring(j,j+i));
                }
         }*/
    }
    public static void subset(String s,int beg)
    {
             if(beg==s.length()+1)
                     return;
             else
              {
                        for(int j=0;j<s.length()-beg+1;j++)
                        {
                               System.out.println(s.substring(j,j+beg));
                         }
                      subset(s,beg+1);
               }
     }
}