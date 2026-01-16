package oop.classes_objects;

/* 
ABSTRACT · FINAL · EXTENDS · @Override
Java - Practical notes with annotations
*/

public class AbstractFinalAndOverride {

    public static void main(String[] args) {

        Animal dog = new Dog();          // allowed: polymorphism
                                        // Animal is abstract, Dog is not

        dog.sound();                     // calls the overridden method
        dog.sleep();                     // inherited method

        Vehicle car = new Vehicle();
        car.start();                     // final method (cannot be overridden)

        Utils.printMessage();            // final class usage
    }
}

/*
ABSTRACT CLASS
abstract after public → cannot be instantiated
*/
abstract class Animal {                  // abstract = cannot use new

    public abstract void sound();         // abstract method = no body
                                         // forces subclasses to implement it

    public void sleep() {                 // regular method
        System.out.println("Sleeping");
    }
}

/*
EXTENDS + OVERRIDE
the child class inherits and must implement abstract methods
*/
class Dog extends Animal {                // extends = inheritance

    @Override                             // overrides parent method
    public void sound() {
        System.out.println("Guau");
    }
}

/*
FINAL METHOD
public final → cannot be overridden
*/
class Vehicle {

    public final void start() {           // final = method locked
        System.out.println("Vehicle started");
    }
}

/*
FINAL CLASS
public final → cannot be inherited
*/
final class Utils {                       // final class = no extends allowed

    public static void printMessage() {
        System.out.println("Hello");
    }
}

/*
SUMMARY:
abstract class  → cannot be instantiated
abstract method → must be implemented
extends          → inheritance
@Override        → safe method overriding
final method     → cannot be overridden
final class      → cannot be inherited
*/
