class base
{
  int x=10;
  void display()
   {
      System.out.println("base  class.........");
      System.out.println("x  ="+x);
   }
}
class derived extends base
{
   int y=90;
   void display()
   {
      System.out.println("derived class by overriding.......");
       System.out.println("x   ="+x+"\ny   =  "+y);
   }
}
class overridingEx
{
  public static void main(String []args)
  {
    derived obj=new derived();
    obj.display();
  }
}