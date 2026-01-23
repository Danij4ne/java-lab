
public class InterfacesAndImplements {

    public static void main(String[] args) {

        // Using interface as reference (polymorphism by interface)
        Flyable bird = new Bird();
        bird.fly();

        Flyable bat = new Bat();
        bat.fly();

        // Using abstract parent + interface
        Animal parrot = new Parrot();
        parrot.sound();
        parrot.sleep();
    }
}

// INTERFACE
 
// A contract: any class that implements Flyable MUST have fly()
interface Flyable {
    void fly();
}

// ABSTRACT CLASS

abstract class Animal {

    public abstract void sound();

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

// IMPLEMENTING CLASSES

class Bird extends Animal implements Flyable {

    @Override
    public void sound() {
        System.out.println("Tweet");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }
}

class Bat extends Animal implements Flyable {

    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void fly() {
        System.out.println("The bat is flying");
    }
}

// ANIMAL WITHOUT FLY

class Parrot extends Animal {

    @Override
    public void sound() {
        System.out.println("Hello!");
    }
}
















