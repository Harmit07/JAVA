import java.util.*;
 
public class pr_21
{
        void getdegree()
        {
           System.out.println("I got a degree");
 
        }  
        public static void main(String[]args)
        {
           pr21 obj=new pr21();
           obj.getdegree();
           Undergraduate obj1=new Undergraduate();
           obj1.getdegree();
           Postgraduate obj2 =new Postgraduate();
           obj2.getdegree();
        }
 
}
class Undergraduate extends pr21
{
   void getdegree()
   {
       System.out.println("I am an Undergraduate");
   }
}
class Postgraduate extends pr21
{
void getdegree()
{
   System.out.println("I am a Postgraduate");
}
 
}
