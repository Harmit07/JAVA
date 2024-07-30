import java.util.*;

public class pr7 {

    public static void main(String[]args)
    {
         int n,i,j;
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter integer:");
         n=sc.nextInt();
         System.out.println("Enter your string");
         String m=sc.next();
        for( i=0; i<n; i++)
        {
          String h=m.substring(0,3);
          System.out.print(h);
      }
    }
}
