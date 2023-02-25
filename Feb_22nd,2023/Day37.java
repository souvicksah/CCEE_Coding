import java.util.*;
class Day37
{
     public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
          String s1=sc.nextLine();
          String s2=sc.nextLine();
          HashMap<Character,Integer> map=new HashMap<>();
          for(int i=0;i<s1.length();i++)
          {
               map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
          }
         for(int i=0;i<s2.length();i++)
         {
               if(map.containsKey(s2.charAt(i)))
               {
                     int temp=map.get(s2.charAt(i));
                     temp--;
                     if(temp==0)
                         map.remove(s2.charAt(i));
                     else
                         map.put(s2.charAt(i),temp);
               }
         }
          if(map.size()==0)
                 System.out.println("Anagram");
          else
                 System.out.println("Not a Anagram");
    }
}