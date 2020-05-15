import java.util.*;
public class VectorDemo
{
   public static void main(String []args)
    {
       Vector v=new Vector(3,2);
       System.out.println("initial size  :"+(v.size()));
       System.out.println("initial capacity  :"+v.capacity());
       v.addElement(new Integer (1));
       v.addElement(new Integer (2));
       System.out.println("after adding 2 element the capacity  :"+v.capacity());
       v.addElement(new Double(7.09));
       System.out.println(" capacity  :"+v.capacity()); 
       if (v.contains(new Integer(2)))
        {
            System.out.println("Vector contains 2.");
         }
    }
}
