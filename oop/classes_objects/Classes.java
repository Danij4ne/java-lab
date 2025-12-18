package oop.classes_objects;

public class Classes {
    public static void main(String[] args) {

        // Create a Person object using the constructor and initialize its attributes
        var person = new Person("Dani", 24);

        // Assign values to the object's fields
        person.name = "Dani";
        person.age = 24;

        // Call the method to display a greeting
        person.sayHello();

        // Create another Person object with different attribute values
        var person2 = new Person("Daniel", 23);

        // Call the method for the second object, using its own data
        person2.sayHello();

    }
}
