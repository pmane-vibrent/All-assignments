//Write a Java program to create a base class Shape with a method called calculateArea().
// Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
// method in each subclass to calculate and return the shape's area.
public class Shapes {
    double area;
    public double calculateArea(){
        return 0;
    }
    public static void main(String[] args){

        Circle circle=new Circle(10);
        Rectangle rectangle=new Rectangle(10,20);
        Triangle triangle=new Triangle(10,7);

        System.out.println("Area of circle is "+circle.calculateArea());
        System.out.println("Area of rectangle is "+rectangle.calculateArea());
        System.out.println("Area of triangle is "+triangle.calculateArea());

    }

}

class Circle extends Shapes{

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2*3.14*radius;

    }
}

class Rectangle extends Shapes{

    double length,height;
    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return length*height;
    }
}

class Triangle extends Shapes{

    double base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return base*height;
    }
}