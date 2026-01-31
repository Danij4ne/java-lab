package exceptions;

public class Exceptions { // error handling
    
    public static void main(String[] args) {

        // Try - Catch
       
        try {

            var result = 10 / 0; // this causes an error
            System.out.println(result);

        } catch(Exception e) { // we catch the error and store it in 'e'
            System.out.println("ERROR: " + e.getMessage()); // prints the error message

        }

        System.out.print("End");

        try {

            var result = 10 / 0; // this causes an error
            System.out.println(result);

        } catch(ArithmeticException e) { 
            // we can catch the specific error we expect (more professional)
            System.out.println("ERROR: " + e); // prints the error

        }


        // Try - multiple catch blocks

        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Brais";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        }
        catch (ArithmeticException e) {
            System.out.println("Be careful when dividing: " + e);
        }
        catch (NullPointerException e) {  
            // second catch block for null values
            System.out.println("Careful, the value is null: " + e);

        }
        catch (Exception e) { 
            // catches any unexpected exception
            System.out.println("Unexpected error: " + e);
        }


        // finally -> a block that always executes (error or not)

        try {

            var result = 10 / 5;  
            System.out.println(result);

        } catch(ArithmeticException e) {    
            System.out.println("ERROR: " + e);  

        } finally {
            System.out.println("End of try-catch block"); // Always runs
        }

        System.out.println("End");
    }
}
