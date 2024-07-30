import java.util.*;
class pr14
{
int date,month,year;
Scanner s=new Scanner(System.in);
Date()
{


}
Date(int d,int m, int y)

{
  date=d;
month=m;
 year=y;

}

void setsdate()
{
  date=s.nextInt();
}
void setsmonth()
{
  month=s.nextInt();
}
void setsyear()
{
  year=s.nextInt();
}
int getsdate()
{
return date;
}
int getsmonth()
{
return month;
}
int getsyear()
{
return year;
}
void display(){

System.out.print(date+"/"+month+"/"+year);

}

}

class DateTest{

public static void main(String[]args)
{
 Date D=new Date();
 D.setsdate();
D.setsmonth();
D.setsyear();
D.display();

  

}

}

