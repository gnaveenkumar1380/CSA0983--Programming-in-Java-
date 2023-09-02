interface Shape { 
double calculateArea();
}
class Rectangle
{ 
protected double length;
protected double width;
public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
@Override
public double calculateArea() {
return length * width;
}
}
class Cuboid implements Shape {
private Rectangle base;
private double height;
public Cuboid(double length, double width, double height) {
this.base = new Rectangle(length, width);
this.height = height;
}
public double calculateVolume() {
return base.calculateArea() * height;
}
@Override
public double calculateArea() {
return 2 * (base.calculateArea() + base.length * height + base.width * height);
}
public void display() {
System.out.println("Cuboid Dimensions:"); 
System.out.println("Length: " + base.length);
System.out.println("Width: " + base.width);
System.out.println("Height: " + height);
System.out.println("Area: " + calculateArea()); 
System.out.println("Volume: " + calculateVolume());
}
}
public class Main {
public static void main(String[] args) { 
Cuboid cuboid = new Cuboid(4, 3, 5);
cuboid.display();
}
}