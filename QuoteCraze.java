import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan= new Scanner (System.in);

    System.out.print("Enter your quote: ");
    String quote= scan.nextLine();

    System.out.print("Enter the author of the quote: ");
    String author= scan.nextLine();
    String vowA= quote.replace('a',' ');
    String vowE= vowA.replace('e', ' ');
    String vowO= vowE.replace('o', ' ');
    String vowI= vowO.replace('i',' ');
    String vowU= vowI.replace('u',' ');

    int one= quote.indexOf(" ");
    String two= quote.substring(0,one);
    
    

    System.out.println(quote.toUpperCase());
    
     System.out.println(vowU);
    
    System.out.println(two);

    System.out.println("\""+ quote+ "\"");
    System.out.print("--"+ author);
  }
}
