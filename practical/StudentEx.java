import java.util.*;
import java.lang.*;
class Student
{
    String name;
   int roll_no;
    int marks[]=new int[3];
 /*  Student()
   {
     //this.name=name;
     //roll_no=no;
   }*/
   void getData()
   {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter name of student");
        name=sc.next();
       System.out.println("enter enrollment no:");
       roll_no=sc.nextInt();
       System.out.println("enter marks of three subject"); 
       for(int i=0;i<3;i++)
       {
        marks[i]=sc.nextInt();
       }
    }
  void putData()
   {
     System.out.println("the info of student is:");
     System.out.println("name :"+name);
     System.out.println("enroll no :"+roll_no);
     System.out.println("marks :");
    for(int i=0;i<3;i++)
    {
      System.out.print(marks[i]+"  ");
     }
}
}
class StudentEx
{
  public static void main(String args[])
  {
    Student std[]=new Student[3];
     int no;
    System.out.println("enter the number of student to be display info");
     Scanner s=new Scanner(System.in);
    no=s.nextInt();
    for(int i=0;i<no;i++)
     { 
         std[i]=new Student();
         std[i].getData();
    }
  System.out.println("the info of student:");
  for (int i=0;i<no;i++)
  {
    std[i].putData();
   }
 }  
}    
       