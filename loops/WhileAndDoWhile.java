package loops;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        // WHILE LOOP
        // while checks the condition BEFORE entering
        // loop runs only if condition is true
        int i = 1;
        while (i <= 5) {             // condition checked first
            System.out.println(i);   // repeated action
            i++;                     // update to avoid infinite loop
        }

        // DO-WHILE LOOP
        // do-while executes AT LEAST once
        // condition is checked AFTER the block
        int j = 1;
        do {
            System.out.println(j);   // always runs first time
            j++;
        } while (j <= 5);            // condition evaluated here

        // DIFFERENCE
        // while → may skip the block
        // do-while → always runs once
        int x = 10;

        while (x < 5) {              // false → loop body won't execute
            System.out.println("no run");
        }

        do {                          // executes once even if false
            System.out.println("runs once even if condition is false");
        } while (x < 5);

        // BREAK
        // break stops the loop immediately and exits it
        for (int a = 1; a <= 10; a++) {
            if (a == 5) break;       // exit loop at value 5
            System.out.println(a);
        }

        // CONTINUE
        // continue skips ONE iteration and jumps to the next
        for (int b = 1; b <= 5; b++) {
            if (b == 3) continue;    // skip printing b == 3
            System.out.println(b);
        }

        // calling extra methods to test behavior
        int[] data = {1, 3, 5, 7};
        findValue(data, 5);          // method using return inside loop
        demoLoop();                  // method combining break/continue/return
    }


    // RETURN IN LOOPS
    // return exits the ENTIRE method immediately (not only the loop)
    // method must be OUTSIDE main
    public static void findValue(int[] arr, int target) {

        for (int n : arr) {
            if (n == target) {
                System.out.println("found");
                return;              // exits the whole method
            }
        }

        System.out.println("not found");
    }


    // COMBINED EXAMPLE
    // while loop using continue, break and return
    public static void demoLoop() {

        int n = 0;

        while (n < 10) {
            n++;

            if (n == 2) continue;    // skip number 2
            if (n == 5) break;       // exit loop entirely
            if (n == 3) return;      // exit the method completely

            System.out.println(n);
        }

        System.out.println("this line prints only if return did not execute");
    }

}
