//Write a Java program to create a class Vehicle with a method called speedUp().
// Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass
// to increase the vehicle's speed differently.

public class Vehicle {

    int speed=30;
    public void speedUp(){
        speed+=30;
    }

    public static void main(String[] args){

        Bicycle bicycle=new Bicycle();
        Car car=new Car();
        bicycle.speedUp();
        car.speedUp();


    }
}
class Bicycle extends Vehicle{

    @Override
    public void speedUp() {

        System.out.println("Speed should be maximum "+speed +"km/hr for bicycle");
    }
}

class Car extends Vehicle{

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Speed should be maximum "+speed +"km/hr for car");
    }
}