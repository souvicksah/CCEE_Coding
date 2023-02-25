import java.util.*;
class Day38
{
     public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
          String s1=sc.nextLine();
          HashMap<Character,Integer> map=new HashMap<>();
          for(int i=0;i<s1.length();i++)
          {
               map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
          }
         int count=0;
         char a=s1.charAt(0);
          for(Map.Entry<Character,Integer> entry:map.entrySet())
          {
                      if(entry.getValue()>count)
                      { 
                             count=entry.getValue();
                              a=entry.getKey();
                       }
                     
          }
       System.out.println("most frequent chars "+ a);
    }
}