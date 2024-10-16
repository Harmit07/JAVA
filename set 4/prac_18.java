import java.util.*;
 
public class prac_18
{
 
   static Scanner s=new Scanner(System.in);
static String name;
static String address;
 static int age;
 static double no;
 static int salary;
 public static void printsalary()
 {
    System.out.print("enter the name of person : ");
    name=s.next();
    System.out.print("enter the age of person : ");
    age=s.nextInt();
    System.out.print("enter the number of person : ");  
    no=s.nextDouble();
    System.out.print("enter the salary of person :");
    salary=s.nextInt();
   
 
 
 
 
   }  
   public static void main(String[]args)
{
 
    int i;
    System.out.println("enter 1 for employee details");
    System.out.println("enter 2 for manager details");
    System.out.print("enter your choice : ");
    i=s.nextInt();
 
    switch(i)
    {
       case 1:
       employee n=new employee ();
       n.printsalary();
       n.Special();
       n.display();
       break;
       case 2:
       manager m=new manager();
       m.printsalary();
       m.manage();
       m.dis();
       break;
 
   }
}
 
 
}
class employee extends p4_2
{
static String specialization;
 
public void Special()
{
System.out.print("enter your field of specialization:");
specialization=s.next();
System.out.println();
 
 
 
}
static void display()
 
{
   System.out.println("your employee details are :");
 System.out.println();
   System.out.println("Name : "+name);
   System.out.println("age : "+age);
   System.out.println("no : "+no);
   System.out.println("salary : "+salary);
   System.out.println("specialization : "+specialization);
 
}
 
 
}
class manager extends p4_2
{
 
   static String department;
  static void  manage(){
   System.out.println("enter the department you are manager of: ");
    department=s.next();
    System.out.println();
 
}
void dis()
{
 System.out.println("your manager details are :");
 System.out.println();
   System.out.println("Name : "+name);
   System.out.println("age : "+age);
   System.out.println("no : "+no);
   System.out.println("salary : "+salary);
   System.out.println("department : "+department);
}
 
}
