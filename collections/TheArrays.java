package collections;

public class TheArrays {
    public static void main(String[] args) {
        
         
        // 1. ONE-DIMENSIONAL ARRAYS (1D Arrays)
          

        // A) Creating an empty array (with size)
        int[] numbers = new int[4]; // default values = 0
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;

        System.out.println(numbers[1]); // 20


        // B) Creating an array with values directly
        int[] scores = {10, 20, 30, 40};
        System.out.println(scores[2]); // 30


        // Different types of 1D arrays
        int[] ages = {18, 25, 30, 40};
        double[] prices = {10.5, 20.0, 5.99};
        boolean[] flags = {true, false, true};
        char[] letters = {'A', 'B', 'C'};
        String[] names = {"Dani", "Laura", "Marta"};


        // Accessing elements
        System.out.println(names[0]); // Dani
        System.out.println(ages[2]);  // 30


        // Changing values
        names[1] = "Carlos";
        System.out.println(names[1]); // Carlos


        // Array length
        System.out.println(names.length); // number of elements


        // Looping through an array (classic for-loop)
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Enhanced for-loop
        for (String name : names) {
            System.out.println(name);
        }


        // Deleting (null reference)
        names = null;
        System.out.println(names); // null



         
        // 2. OBJECT ARRAYS (mixed types)
         

        Object[] mixed = {"Dani", 23, true, 3.14, 'A'};

        System.out.println(mixed[0]); // Dani
        System.out.println(mixed[1]); // 23
        System.out.println(mixed[2]); // true



          
        // 3. TWO-DIMENSIONAL ARRAYS (2D Arrays)
         

        // A) Creating a 2D array with defined size
        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][2] = 99;

        System.out.println(matrix[1][2]); // 99


        // B) Creating a 2D array with values directly
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix2[0][1]); // 2
        System.out.println(matrix2[2][2]); // 9


        // Printing a 2D array (nested loops)
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }


        // Changing a value
        matrix2[1][1] = 100;
        System.out.println(matrix2[1][1]); // 100


        // 2D Object array (mixed types)
        Object[][] table = {
            {"Dani", 23, true},
            {"Laura", 28, false}
        };

        System.out.println(table[0][0]); // Dani
        System.out.println(table[1][2]); // false


        // Deleting a 2D array
        matrix2 = null;
        System.out.println(matrix2); // null



         
        // 4. OTHER ARRAY CREATION METHODS
         

        // Using "new" with values
        int[] nums = new int[] {1, 2, 3, 4};

        // Creating empty arrays for later use
        boolean[] switches = new boolean[5];
        switches[3] = true;

        System.out.println(switches[3]); // true

    }
}
