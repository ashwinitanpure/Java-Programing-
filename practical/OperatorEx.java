import java.util.*;

class OperatorEx
{
    public static void main (String [] args)
     {
         Scanner sc=new Scanner(System.in);
         int num1;
         int num2;
         System.out.println("enter value of no 1:");
          num1=sc.nextInt();
          System.out.println("enter the value for no 2:");
         num2=sc.nextInt();
         System.out.println("+     : Addition..");
         System.out.println("-     : Substraction..");
          System.out.println("*     : Multiplication..");
          System.out.println("/     : Division..");
          System.out.println("enter your choice to perform specific operation from above: ");
          String ch=sc.next();
          switch(ch)
          {
                case "+":
                                  System.out.println("addition of "+num1+"  and "+num2+"  is  "+(num1+num2));
                                   break;
                case "-":
                                 System.out.println("subtraction of "+num1+"  and "+num2+"  is   "+(num1-num2));
                                  break;
                case "*":
                                  System.out.println("multiplication of "+num1+"  and "+num2+"  is  "+(num1*num2));
                                   break;
                 case "/":
                                  System.out.println("division of "+num1+"  and "+num2+"  is  "+(num1/num2));
                                  break;
                 default :
                                   System.out.println("invalid choice......");
        }
   }
}