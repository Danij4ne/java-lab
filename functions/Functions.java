package functions;

public class Functions {

    public static void main(String[] args) {

        sendEmail(); // 1

        sendEmailToUser("Danij4ne@gmail.com");   
        sendEmailToUser("Danij4ne@gmail.com", "Daniel");   


        var state = sendEmailWithState();  
        // 3 the function executes code (print in this case)
        // and also returns true which we store in a variable
        // in this case called state

        System.out.println(state); // the stored variable


         
        // we use the returned value to make a decision
        if (state) {
            System.out.println("Email sent successfully");
        } else {
            System.out.println("Error sending the email");
        }
    }


 
    // 1- Functions without parameters and without return
   

    public static void sendEmail () { 
        // we create a void function = it does not return anything
        // we ADD STATIC = so it can be executed from main, which is also static
        // if a function is NOT static, it cannot be called directly from main

        System.out.println("Send Email");
    }


  
    // 2- Functions with parameters
  

    public static void sendEmailToUser(String email ) { 
        // we create a function with parameters
        // the email parameter receives the value passed when calling the function
        // String email is a LOCAL variable inside this function

        System.out.println("Send Email to " + email);
    }


    // Overloading (reuse the same name but with different functions)
    // Java decides which one to use depending on the parameters

    public static void sendEmailToUser(String email, String name ) { 
        // we create another function with the same name but different parameters
        // (this way it does not cause an error)
        // this is called OVERLOADING (method overloading)

        System.out.println("Send Email to " + email + " (" + name + ")");
    }


   
    // 3- Functions with Return
 

    public static boolean sendEmailWithState() { 
        // we remove void and add a return type (boolean)
        // this function DOES return a value (true or false)

        System.out.println("Sending the email");

        return true; 
        // we need return to send the value back
        // this return will be available after invoking the function
        // so it can be stored in a variable
    }


    
    // 4- Function with parameters + return 
   

    public static boolean sendEmailValidated(String email) {
        // typical real-world function example
        // receives data -> validates it -> returns a result

        if (email == null || email.isEmpty()) {
            return false; // if the email is empty, we return false
        }

        System.out.println("Email sent to " + email);
        return true; // if everything is correct, we return true
    }

}
