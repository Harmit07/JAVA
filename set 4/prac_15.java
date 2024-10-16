import java.util.*;
class rectangle
{
int l,b;
rectangle()
{
 
}
rectangle(int length,int breadth)
{
l=length;
b=breadth;
 
}
int area()
{
   return l*b;
}
}
class prac_15{
public static void main(String[]args)
{
rectangle r1=new rectangle(5,7);
rectangle r2=new rectangle();
System.out.println(r1.area());
System.out.println(r2.area());
 
 
 
}
}
