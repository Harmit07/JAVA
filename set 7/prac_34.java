import java.util.Random;

class NumberGenerator extends Thread{
  private static final boolean True = false;
public static int num;
  public void run(){
    Random random=new Random();
    while (true) {
        
        num = random.nextInt(100);  // Generate random number between 0 and 99
        System.out.println("Generated number: " + num);

        try {
            Thread.sleep(1000);  // Wait for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    
    }
  }
}

class SquareCalculator extends Thread {
    @Override
    public void run() {
        while (true) {
            if (NumberGenerator.num % 2 == 0) {
                System.out.println("Square of " + NumberGenerator.num + " is: " + (NumberGenerator.num * NumberGenerator.num));
            }
            try {
                Thread.sleep(1000);  // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
 
class CubeCalculator extends Thread{
    public void run(){
        while(true){
            if(NumberGenerator.num%2!=0){
                System.out.println("Cube of "+ NumberGenerator.num+ "is :"+(NumberGenerator.num * NumberGenerator.num * NumberGenerator.num));

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class P34 extends Thread {
     public static void main(String[] args) {
        NumberGenerator t=new NumberGenerator();
        SquareCalculator s=new SquareCalculator();
        CubeCalculator c=new CubeCalculator();
        t.start();
        s.start();
        c.start();
     }
