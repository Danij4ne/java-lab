package loops;

public class TheForEach {

    public static void main(String[] args) {

   
        // 1. WHAT IS THE FOR-EACH LOOP?
       
        // The enhanced for-loop (for-each) is used to iterate over:
        // - arrays
        // - collections (ArrayList, HashSet, etc.)
        //
        // Syntax:
        // for (Type variable : arrayOrCollection) {
        //     code...
        // }

         
        // 2. FOR-EACH WITH 1D ARRAY (String[])
         

        String[] names = {"Dani", "Laura", "Marta"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }


         
        // 3. FOR-EACH WITH int[]
         

        int[] ages = {18, 25, 30, 40};

        for (int age : ages) {
            System.out.println("Age: " + age);
        }


         
        // 4. FOR-EACH WITH double[]
         

        double[] prices = {10.5, 20.0, 5.99};

        for (double price : prices) {
            System.out.println("Price: " + price);
        }


         
        // 5. FOR-EACH WITH boolean[]
         

        boolean[] flags = {true, false, true};

        for (boolean flag : flags) {
            System.out.println("Flag: " + flag);
        }


         
        // 6. FOR-EACH WITH char[]
         

        char[] letters = {'A', 'B', 'C', 'D'};

        for (char letter : letters) {
            System.out.println("Letter: " + letter);
        }


         
        // 7. FOR-EACH WITH Object[] (mixed types)
         

        Object[] mixed = {"Dani", 23, true, 3.14};

        for (Object value : mixed) {
            System.out.println("Value: " + value);
        }


         
        // 8. FOR-EACH WITH 2D ARRAYS (nested loops)
         

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : matrix) {               // each row is a 1D array
            for (int num : row) {                // iterate over each element in that row
                System.out.print(num + " ");
            }
            System.out.println();
        }


         
        // 9. LIMITATIONS OF FOR-EACH
         
        //   You cannot modify the index (no i++)
        //   You cannot access the index (no names[i])
        //   You cannot iterate backwards
        //   You cannot skip values based on index
        //
        // It is used only for reading values.


         
        // 10. COMPARISON: for vs for-each
         

        String[] cities = {"Madrid", "Paris", "Rome"};

        // Normal for-loop (you have index control)
        for (int i = 0; i < cities.length; i++) {
            System.out.println("City (normal for): " + cities[i]);
        }

        // For-each loop (simpler, no index)
        for (String city : cities) {
            System.out.println("City (for-each): " + city);
        }


         
        // 11. CONTINUE and BREAK in for-each
        

        int[] values = {1, 2, 3, 4, 5};

        // using continue (skip numbers)
        for (int v : values) {
            if (v == 3) continue; // skip 3
            System.out.println("Continue example: " + v);
        }

        // using break (stop at number)
        for (int v : values) {
            if (v == 4) break; // stop at 4
            System.out.println("Break example: " + v);
        }
    }
}

    

