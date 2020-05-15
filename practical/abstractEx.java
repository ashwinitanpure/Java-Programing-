abstract class base
{
  abstract void area();
}
class derived1 extends base
{
   int len,width;
   derived1()
   {
    len=10;
    width=20;
   }
   void area()
  { 
     System.out.println("abstract for first derived class example .....");
     System.out.println("area is  :"+(len*width));
   }
}
class derived2 extends derived1
{
  int height;
  derived2()
  {
    height=30;
  }
 void area()
  {
     super.area(); 
     System.out.println("abstract for second derived class example .....");
     System.out.println("area is  :"+(len*width*height));
   }
} 
class abstractEx
{
  public static void main(String []args)
  {
    derived2 obj=new derived2();
    obj.area();
  }
}