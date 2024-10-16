import java.util.*;
public class pr_20 {
   void shape()
   {
       System.out.println("This is a Shape");
 
   }
   
   public static void main(String[]args)
   {
     square obj=new square();
     obj.shape();
     obj.printrectangle();
   }
}
class rectangle extends pr20
{
   
  void printrectangle()
  {
   System.out.println("This is rectangle");
  }
 
}
class square extends rectangle  {
   
   void printsquare()
   {
       System.out.println("rectangle is square");
   }
  }
class circle extends pr20
{
   void printcircle()
   {
       System.out.println("This is circle");
   }
 
 
}
