import java.util.*;
class LoopingEx
{
    public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter the number :");
         int num=sc.nextInt();
         int dummy=num;
         int rem;
         int res=0;
         while(dummy <0)
         {
            rem=dummy%10;
            res+=rem*rem*rem;
            dummy=dummy/10;
         }
        if (res==num)
        {
            System.out.println(num+"       is armstrong");
        }
        else
        {
           System.out.println(num+"    is not armstrong");
        }
    }
}

        