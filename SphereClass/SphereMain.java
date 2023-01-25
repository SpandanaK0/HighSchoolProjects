class Main {
  public static void main(String[] args) {
    Sphere s1 = new Sphere(5.5); 

		System.out.println(s1); 

		System.out.println("Volume: " + s1.volume()); 
		System.out.println("Surface Area: " + s1.surfaceArea()); 

		s1.setDiameter(6.5);

		System.out.println(s1);  

		System.out.println("Volume: " + s1.volume()); 
		System.out.println("Surface Area: " + s1.surfaceArea()); 
  }
}
