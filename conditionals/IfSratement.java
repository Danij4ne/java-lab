package conditionals;

public class IfSratement {
    public static void main(String[] args) {
        

        // IF, ELSE IF, ELSE statements in Java

    int age = 20;

 
    // Simple IF statement
 

    if (age >= 18) { 
    System.out.println("You are an adult.");  // executes only if the condition is true
    }


 
    // IF - ELSE statement
 

    if (age >= 18) {
    System.out.println("Access granted."); 
    } else {
        System.out.println("Access denied.");  // runs when the IF condition is false
    }


 
    // IF - ELSE IF - ELSE chain
 

    int score = 75;

    if (score >= 90) {
        System.out.println("Grade: A");
    } else if (score >= 80) {
        System.out.println("Grade: B");
    } else if (score >= 70) {
        System.out.println("Grade: C");
    } else {
        System.out.println("Grade: D or lower");
    }


 
    // Nested IF statements
    // (an IF inside another IF)
 

    boolean hasID = true;

    if (age >= 18) {
        if (hasID) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("You need an ID to enter.");
        }
    } else {
        System.out.println("You are too young to enter.");
    }


 
    // Multiple conditions
 

    boolean isMember = true;

    if (age >= 18 && isMember) {
        System.out.println("Welcome, VIP member!");
    } else if (age >= 18) {
    System.out.println("Welcome!");
    } else {
        System.out.println("Not allowed.");
    }



    }
}
