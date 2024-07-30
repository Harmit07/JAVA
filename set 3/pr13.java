import java.util.*;
 class pr13
{
Scanner s=new Scanner(System.in);

 String fs;
 String ls;
 Double salary;

Employee()
{
}
  Employee( String f,String l ,Double s)
{

 fs=f;
 ls=l;
 salary=s;

}
void setsfs()
{
fs=s.nextLine();

}
void setsls()
{
ls=s.nextLine();

}
void setssalary()
{
salary=s.nextDouble();


    salary=salary*(10.0/100.0); 




}
String getsfs()
{
return fs;

}
String getsls()
{
return ls;

}
Double getssalary()
{
return salary;


}


}


 class EmployeeTest
{
public static void main(String[]args)
{

Employee E1=new Employee();
E1.setsfs();
E1.setsls();
E1.setssalary(); 
System.out.println(E1.getsfs());
System.out.println(E1.getsls());
System.out.println(E1.getssalary());



}

}

