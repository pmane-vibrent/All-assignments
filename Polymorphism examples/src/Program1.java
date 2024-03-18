//Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
// Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound
// for each animal
import java.util.*;

public class Program1 {

    public static void main(String[] args) {
        Program1 program = new Program1();
        Cat cat = program.new Cat();
        Bird bird = program.new Bird();
        System.out.println(cat.sound());
        System.out.println(bird.sound());
        System.out.println(bird.soundFromAnimal());

    }

    public class Animal {
        public String sound() {
            return "Some animal roar some animal bark";
        }


    }

    public class Bird extends Animal {
        public String sound() {
            return "Bird don't bark or roar";
        }
        public String soundFromAnimal() {
            return super.sound();
        }
    }

    public class Cat extends Animal {
        public String sound() {
            return "Cat sounds meow";
        }
    }
}
