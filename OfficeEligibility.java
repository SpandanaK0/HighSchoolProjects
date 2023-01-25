import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    
    System.out.print("How old are you? ");
    int age= scan.nextInt();
    
    System.out.print("Length of your citizienship: ");
    int cit= scan.nextInt();
    
    boolean sen= true ;
    if (age>= 30){
      if (cit>=9){
        sen= true; 
      }
      else{
        sen= false;
      }
    }
    else{
      sen= false;
    }
    
    boolean rep= true;
    if (age>=25){
      if ( cit>=7){
        rep= true;
        
      }
      else{
        rep=false;
      }
    }
    else{
      rep= false;
    }

    if (sen== false && rep== false){
      System.out.println("Eligible for neither offices");
    }
    else if (sen== true && rep== true){
      System.out.println("Eligible for both offices");
    }
    else if(sen== false && rep==true){
      System.out.println("Eligible to be US Representative");
    }
    else{
      System.out.println("Eligible to be a Senator");
    }
  }
}
