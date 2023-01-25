import java.util.Scanner;

public class Main{
  public static void main(String [] args){
Scanner scan= new Scanner (System.in);

  System.out.print("Enter word: ");
  String word= scan.nextLine();

  System.out.print("Enter a number: ");
  int number= scan.nextInt();

  String word1= word.substring(0,number);
  String word2= word.substring(word.length()- number);
  boolean result = word1.equalsIgnoreCase(word2);
  System.out.print("Result of checking if \"" + word + "\" has the same " + number + " characters at the beginning and end: "+result);
}
}
