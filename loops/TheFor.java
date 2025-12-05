package loops;

public class TheFor {

    public static void main(String[] args) {
        
        
         
        // 1. BASIC FOR LOOP
        

        // for(initialization; condition; increment)
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

         
        // 2. INCREMENT AND DECREMENT
         

        for (int i = 1; i <= 5; i++) {   // increment
            System.out.println("Increment: " + i);
        }

        for (int i = 5; i >= 1; i--) {   // decrement
            System.out.println("Decrement: " + i);
        }

         
        // 3. STEPS (increment by more than 1)
        

        for (int i = 0; i <= 20; i += 5) {
            System.out.println("Step of 5: " + i);
        }


        // 4. LOOPING THROUGH ARRAYS
        
        String[] names = {"Dani", "Laura", "Marta"};

        // Classic for-loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        
        // 5. ENHANCED FOR LOOP (for-each)
         

        for (String n : names) {
            System.out.println("Enhanced loop: " + n);
        }

         
        // 6. FOR LOOP WITH CONDITIONS
         

        // Print only even numbers
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }

        // Print only odd numbers
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }

  
        // 7. NESTED FOR LOOPS
        

        // Printing a 3x3 grid
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }


         
        // 8. BREAK AND CONTINUE
         

        // continue → skip an iteration
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip number 3
            }
            System.out.println("Continue example: " + i);
        }

        // break → stop the loop completely
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; // stop at 4
            }
            System.out.println("Break example: " + i);
        }


        
        // 9. LOOP IN REVERSE ORDER
         

        int[] nums = {10, 20, 30, 40};

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("Reverse: " + nums[i]);
        }





    }
    
}
