import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan= new Scanner (System.in);

    System.out.print("Enter side 1: ");
    double side1= scan.nextDouble();

    System.out.print("Enter side 2: ");
    double side2= scan.nextDouble();

    System.out.print("Enter side 3: ");
    double side3= scan.nextDouble();

    double total= (side1 + side2 + side3)/2;
    double total2= total*(total-side1)*(total-side2)*(total-side3);

    double result= Math.sqrt(total2);
    
    
    System.out.print("The area of the triangle is " + String.format("%.02f", result));

  }
}
