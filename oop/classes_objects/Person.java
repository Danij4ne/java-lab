package oop.classes_objects;

public class Person {

    // Attributes (fields)
    private String name; // stores the person's name
    final private int id ;     // Stores the person's id. Being declared as 'final', its value can only be assigned once (typically in the constructor) and cannot be modified afterwards
    private int age ;                        // neither from outside nor within the class.
    // Constructor
    public Person(String name, int age, int id) {
        // The constructor forces the object to be created with a name and an age (not optional)

        // 'this.name' refers to the class attribute,
        // while 'name' refers to the constructor parameter
        this.name = name;
        this.id = id ;
        // Assign the constructor parameter to the class attribute
        this.setAge(age) ; // Assigns the age to the 'age' attribute using the setter to apply validation before storing it

    }

    // Methods
    public void sayHello() {
        // Calls the method to display a greeting using the object's data
        System.out.print("Hi, I am " + name + " and I am " + age + " years old");
    }

 // Getters / Setters  -> since int and String are private, we create methods to access their values

// Getters

    public int getAge(){  // example of a getter to retrieve and print the age
        return age;
    }


// Setter

    public void setAge(int age){ // validates that the value is greater than 0 before using the setter to modify the field
        if (age > 0) {
            this.age = age;
        } else {
            System.out.print("Invalid age");
        }
    }



// Access Modifiers
// public    -> can be accessed from anywhere in the program
// private   -> can only be accessed from within the class
// protected -> can be accessed within the same package and by subclasses
// default   -> allows access only within the same package

}