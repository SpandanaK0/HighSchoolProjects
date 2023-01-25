import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scan= new Scanner(System.in);

  System.out.print("Integer value 1: ");
  int a= scan.nextInt();
  System.out.print("Integer value 2: ");
  int b= scan.nextInt();
  System.out.print("Integer value 3: ");
  int c= scan.nextInt();
  
  if (a%10<5){
    int num1= a-(a%10);
    a=num1;
  }
  else {
    int num11= 10-(a%10);
    int sum= a+ num11;
    a= sum;
  }
  

  if (b%10<5){
    int num2= b-(b%10);
    b= num2; 
  }
  else {
    int num12= 10-(b%10);
    int sum2= b+ num12;
    b= sum2; 
  }
  
  
  if (c%10<5){
    int num3= c-(c%10);
    c= num3;
  }
  else{
    int num13= 10-(c%10);
    int sum3= c+ num13;
    c= sum3;
  }
  
  
  int sums= a+ b +c;
  System.out.println(sums);
  }
}
