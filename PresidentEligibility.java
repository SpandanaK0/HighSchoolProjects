import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner (System.in);
    
    System.out.print("Are you a natural-born citizen (answer 1 for yes or 2 for no): ");
    int born= scan.nextInt();
    System.out.print("Enter your age: ");
    int age= scan.nextInt();
    System.out.print("How long have you been a resident of the US: ");
    int res= scan.nextInt();
    if (born== 1){
      if (age>= 35){
        if (res>=14){
          System.out.println("You can become a president");
        }
        else{
          System.out.println("You cannot become a president");
        }
      }
      else{
        System.out.println("You cannot become a president");
      }
    }
    else if (born ==2){
      System.out.print("You cannot become a president");
    }
    else{
      System.out.println("Sorry that is not a valid input");
    }
  }
}
