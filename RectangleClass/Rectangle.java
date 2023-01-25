public class Rectangle {
  private double width;
  private double height;
    
  /**
  * This is the constructor to create a Rectangle.
  * To create a Rectangle we need to know its width
  * and height.
	*/
  public Rectangle(double rectWidth, double rectHeight) {
  	width = rectWidth;
    height = rectHeight;
  }
	
	// Put your getter methods here 
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }
	// Put your setter methods here 
  public void setWidth(double newW){
    width= newW;
  }
  public void setHeight (double newH){
    height= newH;
  }
	// This method computes and returns the area of the Rectangle. 
  public double area() {
		// write your code here
    return width * height;
  }
    
  // This method computes and returns the perimeter of the Rectangle.
  public double perimeter() {
		// write your code here
    return (2*width + 2*height);
  }
    
  // This is the toString method. It returns a String representation of the object.
  public String toString() {
		// write your code here
    return "Rectangle with width " + width + " and height "+ height;
  }
}
