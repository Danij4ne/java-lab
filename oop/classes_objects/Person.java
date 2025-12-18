package oop.classes_objects;

public class Person {

    // Attributes (fields)
    String name; // stores the person's name
    int age;     // stores the person's age

    // Constructor
    public Person(String name, int age) {
        // The constructor forces the object to be created with a name and an age (not optional)

        // 'this.name' refers to the class attribute,
        // while 'name' refers to the constructor parameter
        this.name = name;

        // Assign the constructor parameter to the class attribute
        this.age = age;
    }

    // Methods
    public void sayHello() {
        // Calls the method to display a greeting using the object's data
        System.out.print("Hi, I am " + name + " and I am " + age + " years old");
    }
}
