public class HomeWork
{
  public static void main(String args[])
  {
     try
     {int [] a=new int[3];
      a[3]=4;
      System.out.print("A");}
     catch(ArrayIndexOutOfBoundsException e)
     {System.out.print("B");}
     catch(Exception e)
     {System.out.print("C");}
     finally
     {System.out.print("D");}
  }
}
