import java.util.*;
class MulArrayEx
{
    public static void main(String []args)
    {
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        int res[][]=new int [2][2];
        Scanner sc=new Scanner(System.in);
         System.out.println("enter array 1 element");
         for (int i=0;i<2;i++)
         {
            for(int j=0;j<2;j++)
            {
             arr1[i][j]=sc.nextInt();
            }
         }
         System.out.println("enter element for array 2");
         for(int i=0;i<2;i++)
          {
             for(int j=0;j<2;j++)
              {
                   arr2[i][j]=sc.nextInt();
              }
          }
         for(int i=0;i<arr1.length;i++)
          {
              for(int j=0;j<arr2.length;j++)
               {
                 for (int k=0;k<2;k++)
                  {
                   res[i][j]=res[i][j]+arr1[i][k]*arr2[k][j];
                  }
                }
          }
       System.out.println("the element of array of multiplication.......");
        for(int i=0;i<res.length;i++)
        {
               for(int j=0;j<res.length;j++)
                {
                   System.out.print(res[i][j]+"  ");
                }
                System.out.println();
          }
    }
}