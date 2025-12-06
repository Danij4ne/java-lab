package exercises;

import java.util.Scanner;

public class Exercises_Full_Java {
 
// EXERCISE 1: Matrix addition with random numbers
 
// Task:
// 1. Ask the user for the size of two square matrices (n x n).
// 2. Generate two matrices with random numbers 0–50.
// 3. Create a third matrix with the sum of both.
// 4. Display all matrices.
//
// Console sample:
//
// Matrix A:
// 12 5 30
// 0  7 18
// 25 4 10
//
// Matrix B:
// 3  10 2
// 7   1 6
// 8   9 11
//
// Matrix Sum:
// 15 15 32
// 7   8 24
// 33 13 21


public void SumAleatoryArrays() {
    Scanner showme = new Scanner(System.in);
    System.out.println("Enter the size of the matrices");
    int Number = showme.nextInt();

    int[][] MA = new int[Number][Number];
    int[][] MB = new int[Number][Number];
    int[][] MSum = new int[Number][Number];

    // Fill matrices
    for (int i = 0; i < Number; i++) {
        for (int j = 0; j < Number; j++) {
            MA[i][j] = (int) (Math.random() * 51); 
            MB[i][j] = (int) (Math.random() * 51); 
            MSum[i][j] = MA[i][j] + MB[i][j];
        }
    }

    showme.close();
}



 
// EXERCISE 2: Array with movement options
 
// Task:
// 1. Create a 10-element array.
// 2. Fill it with random numbers 1–20.
// 3. Show a menu:
//      1. Print array
//      2. Move left
//      3. Move right
//      4. Reverse array
//      5. Exit
//
// Console sample:
//
// Array: [4, 12, 7, 18, 5, 9, 14, 3, 20, 8]
//
// Option 2 → Move left
// [12, 7, 18, 5, 9, 14, 3, 20, 8, 4]



 
// EXERCISE 3: Grade system with arrays
 
// Task:
// - Store 10 grades.
// - Validate input (0–10).
// - Show average, max, min, passes and fails.
//
// Sample:
//
// Average: 6.85
// Max: 9.0
// Min: 4.0
// Pass: 7
// Fail: 3


 
// EXERCISE 4: World Cup draw
 
// Task:
// - Ask for 5 teams in Pot A and 5 teams in Pot B.
// - Randomly pair teams without repeating.
// - Display matchups.
//
// Sample:
//
// Argentina vs Japan
// France vs Mexico
// ...



 
// EXERCISE 5: Guess the number (1–50)
 
// - Program chooses a number.
// - User has 7 attempts.
// - Tell if higher/lower.
//
// Sample:
//
// Attempt 1: 20 → Higher
// Attempt 3: 30 → Correct!



 /* 
   EXERCISE 6: Simple Wordle
 
   - Choose a random 5-letter word.
   - User has 5 attempts.
   - Show: correct position, wrong position, not present.

   Sample:

   Try 1: PERRO
   Correct: 1
   Close: 2
   Wrong: 2
*/



 
// EXERCISE 7: Custom pizza builder
 
// Sample:
//
// Choose ingredient:
// 1. Cheese (10)
// 2. Ham (15)
//
// Selected: 1
// Subtotal: 10
//
// Final pizza: Cheese, Pepperoni
// Total: 22



 
// EXERCISE 8: Darts game (301 points)
 
// - Two players start at 301.
// - 3 darts each turn.
// - Win if reach exactly 0.
//
// Sample:
//
// Ana: 20+15+5 = 40 → 261
// Luis: 60+60+60 = 180 → 121
// Winner: Ana


 
// EXERCISE 9: Grade system (switch + for)
 
// Convert numeric grade to letter.
//
// Sample:
//
// 8 → B
// 6 → C
// 9 → A



 
// EXERCISE 10: ATM simulation
 
// Sample:
//
// Balance: 1000
// Withdraw 1500 → Not enough
// Withdraw 300 → New balance: 700



 
// EXERCISE 11: One-dimensional arrays
 
//
// Fruits:
// Apple
// Banana
//
// Index + value:
// Position 0: 10



 
// EXERCISE 12: Multidimensional arrays
 
//
// Matrix 3x3:
// 1 2 3
// 4 5 6
// 7 8 9
//
// Find element:
// Found at [1][2]



 
// EXERCISE 13: Final project – full grade system
 
//
// Show table, student averages, subject averages, highest grade.
//
// Sample:
//
// 7.5 8.0 6.5 9.0
// ...
// Highest: 10.0 (Student 3, Subject 4)

}
