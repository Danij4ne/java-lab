package exceptions;

public class ThrowAndThrows {

     
    //  Using throw + throws (built-in exception)
    
    public static void checkAge(int age) throws IllegalArgumentException {
        // If the condition is true, we manually throw an exception
        if (age < 18) {
            throw new IllegalArgumentException("You must be over 18");
        }
        // If no error, normal execution continues
        System.out.println("Valid age: " + age);
    }

    
    // Using throw + throws (custom exception)
    
    public static void checkScore(int score) throws CustomException {
        // Validate score range
        if (score < 0 || score > 100) {
            throw new CustomException("Score must be between 0 and 100");
        }
        System.out.println("Valid score: " + score);
    }

   
    // MAIN METHOD: Where exceptions are captured
    
    public static void main(String[] args) {

        // Example with built-in exception  
        try {
            checkAge(15); // This will throw an exception
            System.out.println("Age check passed");
        } catch (IllegalArgumentException e) {
            // Error is captured here
            System.out.println("Error caught: " + e.getMessage());
        }

        System.out.println("Program continues after age check");

        // Example with custom exception  
        try {
            checkScore(150); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Custom error caught: " + e.getMessage());
        }

        //  Finally block example 
        try {
            int result = 10 / 5;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e);
        } finally {
            // This block always runs (error or not)
            System.out.println("End of try-catch block");
        }

        System.out.println("End of program");
    }
}

// CUSTOM EXCEPTION CLASS
 
class CustomException extends Exception {

    // Constructor to pass a custom message
    public CustomException(String message) {
        super(message);
    }
}
