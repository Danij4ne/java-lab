package strings;

public class TheSrings {

    public static void main(String[] args) {
        

     // concatenation

    String name = "Dani";
    String surname = "Garcia";

    System.out.println(name + " " + surname);


    // length

    System.out.println(name.length()); // number of characters


    // get character 

    System.out.println(name.charAt(1)); // get the character at position 1
    System.out.println(name.charAt(name.length() - 1)); // get the last character of 'name'


    // substring

    System.out.println(name.substring(2)); // prints from index 2 to the end
    System.out.println(name.substring(1, 3)); // prints characters from index 1 to 2 (3 is excluded)


    // uppercase / lowercase

    System.out.println(name.substring(2));

    System.out.println(name.toUpperCase()); // uppercase
    System.out.println(name.toLowerCase()); // lowercase


    // contains 

    System.out.println("Hello, Java".contains("ava")); // true


    // compare strings

    System.out.println(name.equals("Dani")); // compares content
    System.out.println(name.equalsIgnoreCase("Dani")); // ignores case differences


    // trim -> remove spaces at the beginning and end

    System.out.println(" Hello , my name is Dani ".trim());


    // replace -> replace characters or text

    System.out.println(" Hello , my name is Dani ".replace("Hello", "Hi")); // replace "Hello" with "Hi"


    // format

    var age = 33;
    System.out.println(String.format("Hola, %s. Tengo %d", name, age));






    }







}