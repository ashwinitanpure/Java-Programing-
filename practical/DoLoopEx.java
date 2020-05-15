import java.util.*;
class DoLoopEx
{
   public static void main(String []args)
   {
      int num;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the number ");
      num=sc.nextInt();
      int i=2;
      int count=0;
      do
       {
           if(num%i==0)
           {
              count++;
           }
            i++;
       }
       while(i<num);
       if(count==0)
       {
           System.out.println(num+"  is prime number.......");
       }
       else
       {
           System.out.println(num+"  is not prime number....");
       }
   }
}