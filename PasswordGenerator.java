import java.util.Scanner;
import java.util.Random;

public class Main{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    Random rando= new Random();

    System.out.print("Enter your first name: ");
    String name= scan.nextLine();
    System.out.print("Enter your middle name: ");
    String middle= scan.nextLine();
    System.out.print("Enter your last name: ");
    String last= scan.nextLine();
    System.out.print("Enter your favorite animal: ");
    String animal= scan.nextLine();
    System.out.print("Enter your birth year: ");
    String birth= scan.nextLine();

    int name1= rando.nextInt(name.length()-1);
    int middle1= rando.nextInt(middle.length()-1);
    int last1= rando.nextInt(last.length()-1);
    int animal1= rando.nextInt(animal.length()-1);
    int birth1= rando.nextInt(birth.length()-1);

    System.out.print(name.charAt(name1));
    System.out.print(middle.charAt(middle1));
    System.out.print(last.charAt(last1));
    System.out.print(animal.charAt(animal1));
    System.out.println(birth.charAt(birth1));
  
    
  }
}
