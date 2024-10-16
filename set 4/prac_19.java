import java.util.*;
 
public class pr_19
{
 
 int length;
    int breadth;
   
     pr19(int length,int breadth)
     {
       this.length=length;
       this.breadth=breadth;
     }
   void perimeter()
   {
       
    int c=2*(length+breadth);
    System.out.print("Perimeter is :"+c);
    System.out.println();
 
   
   }
   void area()
   {
      int a=length*breadth;
      System.out.print("area  is :"+a);
      System.out.println();
   }
public static void main(String[]args)
{
     
 
pr19 obj[]=new pr19[4];
obj[0]=new pr19(2,3);
obj[1]=new pr19(3,4);
obj[2]=new square(5);
obj[3]=new square(4);
 
for(pr19 obj1:obj)
{
   if(obj1 instanceof square)
   {
       System.out.println("square");
   }
   else
   {
       System.out.println("rectangle");
   }
   obj1.perimeter();
   obj1.area();
   System.out.println();
}
 
 
 
 
   
}
}
class square extends pr19
{
   int side;
 
   
   square(int side ) {
       super(side, side );
       
   }
 
