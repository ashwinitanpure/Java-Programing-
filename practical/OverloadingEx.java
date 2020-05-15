class Demo
{
   int length,breadth,height;
   int area (int length, int breadth)
   {    
      this.length=length;
      this .breadth=breadth;
      return(length*breadth);
  }
  int area (int l,int b,int h)
  {
    length=l;
    breadth=b;
    height=h;
    return (length*breadth*height);
  }
}
class OverloadingEx
{
  public static void main(String [] args)
  {
    Demo obj=new Demo();
    int area1= obj.area(10,40);
     System.out.println("the area is :"+area1);
    int area2=obj.area(10,20,30);
     System.out.println(" the area is :"+area2);
  }
}
    
   