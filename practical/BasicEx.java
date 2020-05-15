import java.util.*;
class BasicEx
{
 public static void main (String args[])
 {
    char ch;
    int a=10;
    int b=20;
    int res;
    System.out.println("enter option te be performed");
    Scanner sc=new Scanner(System.in);
   ch=sc.next().charAt(0);
   switch(ch)
   {
     case '+':
               res=a+b;
               System.out.println("addition is :"+res);
               break;
     case '-': 
                res=a-b;
                System.out.println("substraction is :"+res);   
                break;
      case '*': 
                res=a*b;
                System.out.println("multiplication is :"+res);   
                break;
      case '/': 
                res=a/b;
                System.out.println("divison is :"+res);   
                break;
   }
 }
}   
   