//Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
// Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods
// in each subclass to start and stop the engines differently.
public class VehicleStart {

    public String startEngine(){
        return "Start engine";

    }
    public String endEngine(){
        return "End engine";
    }

    public static void main(String[] args){

        Bicycles bicycles=new Bicycles();
        Cars cars=new Cars();

        try {
            System.out.println(bicycles.startEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(cars.startEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(cars.endEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(bicycles.endEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(cars.startEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(cars.endEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(bicycles.startEngine());
            Thread.sleep(1000); // Pause for 1 second
            System.out.println(bicycles.endEngine());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






    }
}
class Bicycles extends VehicleStart{

    @Override
    public String startEngine() {
        return "Bicycle engine started";
    }

    @Override
    public String endEngine() {
        return "Bicycle engine ended";
    }
}

class Cars extends VehicleStart{
    @Override
    public String startEngine() {
        return "Car engine started";
    }

    @Override
    public String endEngine() {
        return "Car engine ended";
    }

}