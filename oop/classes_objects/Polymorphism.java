package oop.classes_objects;

public class Polymorphism { 

    // Allows a method or a class to behave in different ways depending on the context
    
    public static void main(String[] args) {
        
        // Two types of polymorphism
        
        // 1 - Polymorphism by inheritance (method overriding)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // 2 - Polymorphism by overloading (method overloading)

        var calcu = new Calculator();

        calcu.sum(2.3, 4.1);
        calcu.sum(80, 10);
    }

    public static class Animal {

        public void sound() {
            System.out.println("Some sound");  
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    public static class Calculator {

        public int sum(int a, int b) {   // same method name
            return a + b;
        }

        public double sum(double a, double b) {   // this is polymorphism by overloading
            return a + b;
        }
    }
}
