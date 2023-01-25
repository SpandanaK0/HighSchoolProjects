public class Sphere{
  private double diameter;
  public Sphere (double sphereDiameter){
    diameter= sphereDiameter;
  }
  public double getDiameter (){
    return diameter;
  }
  public void setDiameter(double newD){
    diameter= newD;
  }
  public double volume(){
    return (4.0/3 * Math.PI * Math.pow((diameter/2),3));
  }
  public double surfaceArea(){
    return (4 * Math.PI * Math.pow((diameter/2),2));
  }
  public String toString(){
    return "Sphere diameter: " + diameter; 
  }
}
