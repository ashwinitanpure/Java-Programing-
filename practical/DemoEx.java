class Demo
{
  int x,y;
  Demo(int a,int b)
  {
    x=a;
    y=b;
  }
 void display()
  {
    System.out.println("value of x= "+x+"\n value of y= "+y);
  }
}
class ObjectEx
{
  public static void main(String []args)
  {
     Demo obj=new Demo(10,20);
      obj.display();
  }
}