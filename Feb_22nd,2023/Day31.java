import java.util.*;
class Day31
{
    public static void main(String []args)
   {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int flag=0;
         for(int i=0;i<s.length()/2;i++)
         {
                if(s.charAt(i)!=s.charAt(s.length()-i-1))
                 {
                         flag=1;
                         break;
                  }
         } 
         if(flag==1)
               System.out.println("Not a plaindrome");
         else
                System.out.println("Is a Palindrome");          
   }
}