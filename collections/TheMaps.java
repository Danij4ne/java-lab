package collections;
import java.util.HashMap;

    // stores key-value pairs, does not allow duplicate keys
    // it is unordered, you must search elements by key

public class TheMaps {

   public static void main(String[] args) {

        // Declaration and creation
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Size
        System.out.println(names.size());

        // Insertion
        names.put("Alex", "alex@gmail.com");
        names.put("Dani", "danij4ne@gmail.com");
        names.put("DaniDev", "danij4ne@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Access
        System.out.println(names.get("Dani"));
        System.out.println(names.get("Dev"));

        // Verification
        System.out.println(names.containsKey("Dani"));
        System.out.println(names.containsKey("Dev"));
        System.out.println(names.containsValue("danij4ne@gmail.com"));

        // Deletion
        System.out.println(names.remove("Dani"));
        System.out.println(names.remove("DaniDev"));
        System.out.println(names);

        // Clear
        names.clear();
        System.out.println(names);

        // Modification
        names.put("Alex", "alex@gmail.com");
        System.out.println(names);

        names.put("Alex", "alex.updated@gmail.com");
        System.out.println(names);

        names.replace("Dani", "danij4ne@gmail.com"); // Replaces the value if the key exists
        System.out.println(names);

        names.putIfAbsent("Dani", "danij4ne@gmail.com"); // Only adds it if it does not exist
        System.out.println(names);

        // Other operations
        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
}


    
}
