import java.util.Scanner;

public class pr3 {

public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.print("enter distance in meters :");
float dis, ts, tm, th;
dis = s.nextFloat();
System.out.print("enter time in hours :");
th = s.nextFloat();
System.out.print("enter time in minutes :");
tm = s.nextFloat();
System.out.print("enter time in second :");
ts = s.nextFloat();

float tts = ts + (tm * 60) + (th * 60 * 60);
float tth = th + (tm / 60) + (ts / 3600);
