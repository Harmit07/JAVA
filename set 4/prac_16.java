import java.util.*;
public class prac_16 {
   private double real;
   private double imag;
 
   public Complex(double real, double imag) {
       this.real = real;
       this.imag = imag;
   }
 
   public Complex add(Complex other) {
       return new Complex(real + other.real, imag + other.imag);
   }
 
   public Complex subtract(Complex other) {
       return new Complex(real - other.real, imag - other.imag);
   }
 
   public Complex multiply(Complex other) {
       double newReal = real * other.real - imag * other.imag;
       double newImag = real * other.imag + imag * other.real;
       return new Complex(newReal, newImag);
   }
 
   
   public String toString() {
       return String.format("%.2f + %.2fi", real, imag);
   }
 
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 
       System.out.print("Enter the real and imaginary parts of the first complex number (separated by space): ");
       double real1 = scanner.nextDouble();
       double imag1 = scanner.nextDouble();
 
       System.out.print("Enter the real and imaginary parts of the second complex number (separated by space): ");
       double real2 = scanner.nextDouble();
       double imag2 = scanner.nextDouble();
 
       Complex c1 = new Complex(real1, imag1);
       Complex c2 = new Complex(real2, imag2);
 
       Complex sum = c1.add(c2);
       Complex difference = c1.subtract(c2);
       Complex product = c1.multiply(c2);
 
       System.out.println("Sum: " + sum);
       System.out.println("Difference: " + difference);
       System.out.println("Product: " + product);
 
       scanner.close();
   }
}
