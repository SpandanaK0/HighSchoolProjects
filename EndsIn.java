import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner scan= new Scanner (System.in);

    System.out.print("Enter word: ");
    String word= scan.nextLine();

    System.out.print("Enter suffix: ");
    String suff= scan.nextLine();

    int n= suff.length();
    int w= word.length();


    String word1= word.substring(w-n);

    boolean result= word1.equalsIgnoreCase(suff);
    System.out.print("Result of checking if \""+ suff + "\" comes at the end of \""+ word + "\": " +result); 
  }
}
