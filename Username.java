import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.print("Enter your first name: ");
    String first= scan.nextLine();

    System.out.print("Enter your last name: ");
    String last= scan.nextLine();

    System.out.print("Enter your favorite city name: ");
    String city= scan.nextLine();

    String first2= first.substring(0,1);
    String city2= city.substring(0,3);
    String last2= last.substring(0,4);
    String username= first2 + city2+ last2;
    System.out.println(username.toLowerCase());
  }
}
