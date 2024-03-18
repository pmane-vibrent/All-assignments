//Write a Java program to create a class Employee with a method called calculateSalary().
// Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary()
// method to calculate and return the salary based on their specific roles.
public class Employee {

    public double calculateSalary(){
        return 0;
    }
    public static void main(String[] args){

        Manager manger=new Manager(2500,25000);
        Programmer programmer=new Programmer(2400,21000);
        System.out.println("The Salary of Manager is "+manger.calculateSalary());
        System.out.println("The Salary of Programmer is "+programmer.calculateSalary());

    }

}
class Manager extends Employee{

    double hra;
    double basic;
    double bonus=3000;

    public Manager(double hra, double basic) {
        this.hra = hra;
        this.basic = basic;
    }

    @Override
    public double calculateSalary() {
        return hra+basic+bonus;
    }
}
class Programmer extends Employee{

    double hra;
    double basic;
    double bonus=1500;

    public Programmer(double hra, double basic) {
        this.hra = hra;
        this.basic = basic;
    }

    @Override
    public double calculateSalary() {
        return hra+basic+bonus;
    }
}

