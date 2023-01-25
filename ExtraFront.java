import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner scan= new Scanner (System.in);

    System.out.print("Enter a word with two characters or more: ");
    String word= scan.nextLine();
    
    int num1= (int) (Math.random()*10)+1;
    int num2= (int) (Math.random()*900)+ 100;
    String word1= word.substring(0,2);

    System.out.println(num1 + word1 + word1 + word1 + num2);

  }
}
