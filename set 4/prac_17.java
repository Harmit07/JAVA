import java.util.*;
 
 
 
 
 
public class Parent {
   void display() {
       System.out.println("this is object of parent class");
   }
   public static void main(String[] args) {
       Parent p = new Parent();
       child q = new child();
 
       p.display();
       q.dis();
 
   }
}
class child extends Parent {
   void dis() {
       System.out.println("this is object of child class");
   }
}
