package operators;

public class TheOperators {
    public static void main(String[] args) {
        
   // Arithmetic

    var a = 5;
    var b = 3;

    System.out.println(a + b); // addition
    System.out.println(a - b); // subtraction
    System.out.println(a * b); // multiplication
    System.out.println(a / b); // division
    System.out.println(a % b); // modulus (remainder)


    // Assignment


   a = b ; 
   System.out.println(a);  

   a = b * 2 ; 
   System.out.println(a);  

   a += 6 ; 
    System.out.println(a); 
    
    a -= 1 ; 
    System.out.println(a); 

    a *= 1 ; 
    System.out.println(a); 

    a /= 1 ; 
    System.out.println(a); 


    // Comparison Operators

    int x = 10;
    int y = 5;

    System.out.println(x == y);  // equal to (false)
    System.out.println(x != y);  // not equal to (true)
    System.out.println(x > y);   // greater than (true)
    System.out.println(x < y);   // less than (false)
    System.out.println(x >= y);  // greater or equal (true)
    System.out.println(x <= y);  // less or equal (false)


    // Logical Operators

    boolean i = true;
    boolean m = false;

    System.out.println(i && m);  // AND → true only if both are true   (false)
    System.out.println(i || m);  // OR → true if at least one is true  (true)
    System.out.println(!i);      // NOT → inverts the value            (false)


    // Unary Operators

    int n = 5;

    System.out.println(+n);  // unary plus (same value) → 5
    System.out.println(-n);  // unary minus (changes sign) → -5

    n++; // post-increment
    System.out.println(n);  // 6

    n--; // post-decrement
    System.out.println(n);  // 5

    ++n; // pre-increment
    System.out.println(n);  // 6

    --n; // pre-decrement
    System.out.println(n);  // 5

    
    // Ternary Operator

    int age = 20;

    String result = (age >= 18) ? "Adult" : "Minor";
    System.out.println(result);



 }
}
