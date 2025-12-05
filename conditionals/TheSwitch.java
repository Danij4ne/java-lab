package conditionals;

public class TheSwitch {

    public static void main(String[] args) {
        // SWITCH statement in Java

int day = 3;

 
// Basic switch example
 

switch (day) {

    case 1:
        System.out.println("Monday");
        break;  // stops the switch

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day"); // runs when none of the cases match
}


    int month = 4;

    switch (month) {

        case 3:
        case 4:
        case 5:
            System.out.println("Spring");
            break;

        case 6:
        case 7:
        case 8:
            System.out.println("Summer");
            break;

        default:
            System.out.println("Unknown season");
}



    String role = "admin";

    switch (role) {

        case "admin":
            System.out.println("Full access granted.");
            break;

        case "user":
            System.out.println("Limited access.");
            break;

        default:
            System.out.println("Role not recognized.");
}



    int option = 2;

    switch (option) {
        case 1 -> System.out.println("Start");
        case 2 -> System.out.println("Settings");
        case 3 -> System.out.println("Exit");
        default -> System.out.println("Invalid option");
}



    }
    
}
