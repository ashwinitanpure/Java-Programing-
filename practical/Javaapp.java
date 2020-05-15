class Demo
{
  int length,width;
  Demo()                                                                                //default constructor
  {
     length=10;
     width=20;
  }
  Demo(int x,int y)                                                                //parameterized constructor
  {
     length=x;
     width=y;
  }
  Demo (Demo c)				          //copy constructor
  {
     length=(c.length)*2;
     width=(c.width)*2;
  }
  void display()
   {
       System.out.println("the length is  ="+length);
        System.out.println("the width is  ="+width);
       System.out.println("the area is :"+(length*width));
   }
}
public class Javaapp
{
   public static void main(String []args)
   {
       System.out.println("using default constructor...............");
       Demo obj=new Demo();
       obj.display();
       System.out.println("\n\nusing parameterized constructor..................");
        Demo obj1=new Demo(40,3);
        obj1.display();
        System.out.println("\n\nthe use of copy constructor............");
        Demo obj2=new Demo(obj1);
        obj2.display();
    }
}    