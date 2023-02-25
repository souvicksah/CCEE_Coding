class Armstrong
{
    int number;
    Armstrong()
    {
       SOPln("no args called from one arg const");
    }
    Armstrong(int i)
    {
           this();
           number=i;
           sopln("one arg const");
    }
    public String isArmstrong()
    {
           int num=this.number; 
            int sum=0;
           while(num!=0)
           {
                 sum=num%10*num%10*num%10;
                 num=num/10;
            }
           if(sum==this.number)
                    return "is Armstrong";
           return "not a Armstring";

    }
}
class A
{
     PSVM(String []args)
     {
          Armstrong a=new Armstring(153);
          sopln(a.isArmstrong());
     }
}