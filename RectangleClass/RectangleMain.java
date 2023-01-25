class Main {
  public static void main(String[] args) {
		// Create a least two Rectangle objects.
		// Test all the methods to ensure they work properly. 
     
    Rectangle r1= new Rectangle (10.5, 15.5);
    System.out.println(r1);
    System.out.println("Perimeter: " + r1.perimeter() + " Area: " + r1.area()); 

    r1.setWidth(10);
    r1.setHeight(11);
    System.out.println(r1);
    System.out.println("Perimeter: " + r1.perimeter() + " Area: " + r1.area()); 

  }
}
