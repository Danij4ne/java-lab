package oop.classes_objects;

import oop.classes_objects.inheritance.Animal;

public class inheritance {
    public static void main(String[] args) {

        var animal = new Animal("animals");
        animal.eat();

        var dog = new Dog("Boby");
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("The animal named " + name + " is eating");
        }
    }

    public static class Dog extends Animal { 
        // With extends it inherits everything that Animal has

        public Dog(String name) {
            super(name); 
            // super must be called to satisfy the constructor of the Animal class
        }
    }

    public static class Cat extends Animal { 
        // With extends it inherits everything that Animal has

        int age;

        public Cat(String name, int age) { 
            // we add an exclusive property for Cat, which is age
            super(name); 
            // super must be called to satisfy the constructor of the Animal class
            this.age = age;
        }

        @Override
        public void eat() {   
            // ← HERE the method is overridden
            System.out.println("The cat " + name + " is eating");
        }
    }

    public static class Bird extends Animal { 
        // With extends it inherits everything that Animal has

        public Bird(String name) {
            super(name); 
            // super must be called to satisfy the constructor of the Animal class
        }

        public void fly() {
            System.out.println("The animal named " + name + " is flying");
            // we have specialized its behavior, and this is something only the bird does
        }
    }
}
