class Demo
{
   int length,width,height,radius;
   void area(int r)
   {
      System.out.println("\n\nthe function is called to calculate the area of circle.....");
      System.out.println("the area of circle is .."+(3.14*r*r));
    }
   void area (int l,int w)
   {
      System.out.println("\n\nthe function is called to calculate the area of rectangle.....");
      System.out.println("the area of rectangle is .."+(l*w));
   }
   void area (int l,int w,int h)
   {
      System.out.println("\n\nthe function is called to calculate the volume of rectangle.....");
      System.out.println("the volume of rectangle is .."+(l*w*h));
   }
}
class OverldEx
{
  public static void main(String []args)
  {
    Demo obj=new Demo();
    obj.area(5);
    obj.area(10,20);
    obj.area(5,15,25);
 }
}