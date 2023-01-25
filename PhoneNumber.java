public class Main{
  public static void main(String[] args){
    int first= (int)(Math.random()*8);
    System.out.println(first);
    int second= (int) (Math.random()*8);
    int third= (int)(Math.random()*8);

    int secPart= (int)(Math.random()*643)+100;
    int thirdPart= (int)(Math.random()*9000)+1000;


    System.out.println("Your randomly generated phone number is: " + first + second + third+ "-"+ secPart+"-"+ thirdPart );

  }
} 
