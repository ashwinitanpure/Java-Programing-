class base
{
  int len,width;
  base(int x,int y)
  {
     len=x;
     width=y;
 }
 void display()
  {
    System.out.println("area of rectanle is..  "+(len*width));
  }
}
class rectArea extends base
{
  int height;
   rectArea(int x,int y, int z)
   {
      super(x,y);
      height=z;
   }
void displayRect()
 {
    System.out.println("valume of rectangle is   "+(len*width*height));
 }
}
class superEx
{
   public static void main(String []args)
   {
      rectArea obj=new rectArea(10,12,30);
       obj.display();
      obj.displayRect();
   }
}