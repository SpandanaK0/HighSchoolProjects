import java.util.Scanner;
public class Main{
  public static void main(String[]args){
  Scanner scan= new Scanner (System.in);

  System.out.print("Enter a year: ");
  int year= scan.nextInt();
  if (year%4 ==0){
    if (year%100==0){
      if (year%400!=0){
        System.out.print("The year "+ year+" is not a leap year");
      }
    }
    //if else 
  }
  //else if()
  else if (year%4==0){
    // if (year%100 != 0){
    //   if (year%400 !=0){
    //     System.out.println("The year "+year + " is a leap year");
    //   }
    // }
    System.out.print("The year "+ year+" is a leap year");  
  }
  else{
    System.out.println("The year "+ year+" is not a leap year");
  }
  }
  }
