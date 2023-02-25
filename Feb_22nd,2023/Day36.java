import java.util.*;
class Day36
{
    static int check(List<Integer> list,String s1,String s2,int begindex)
    {
              for(int i=0,j=begindex;i<s1.length();i++,j=(j+1)%s2.length())
              {
                  if(s1.charAt(i)!=s2.charAt(j%s2.length()))
                          return 1;
              }
           return 0;
    }    
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
           String s1=sc.nextLine();
           String s2=sc.nextLine();
           List<Integer> list=new ArrayList<>();
           if(s1.length()!=s2.length())
           {
                System.out.println("not a rotated String");
           }
          else{
           for(int i=0;i<s1.length();i++)
           {
                 if(s1.charAt(0)==s2.charAt(i))
                 {
                     list.add(i);
                 }
           }
          int flag=1;
          for(int i=0;i<list.size();i++)
          {
                flag=check(list,s1,s2,list.get(i));
                if(flag==0)
                      break;
           }
           if(flag==0)
                  System.out.println("rotated String");
           else
                   System.out.println("not a rotated String");
         }
            
    }
}