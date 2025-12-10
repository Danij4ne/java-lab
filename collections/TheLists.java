package collections;
import java.util.ArrayList;

// ArrayList permite crear elementos igual que el Array pero en este caso no es necesario declarar un tamaño fijo
// Son estructuras ordenadas 

public class TheLists {
    public static void main(String[] args) {

        //Declaracion y creacion clasica 
        ArrayList<String> names = new ArrayList<>();

        // Declaracion y creacion moderna con int + variable 
        var numbers = new ArrayList<Integer>(); 

        // Tamaño 
        System.out.println(names.size()); // 0

        //añadir elementos 

        names.add("Dani");
        names.add("Jane");
        names.add("Danij4ne");
        System.out.println(names.size());

        //acceder a los elementos 

        System.out.println(names.getFirst()); // ves el indice cero / primero
        System.out.println(names.get(1)); 
        System.out.println(names.getLast()); // ves ultimo indice 


        // modificar elementos 

        names.set(2, "Danij4ne@gmail.com"); // en la ultima psocion cambiamos el elemento 
        System.out.println(names.getLast()); // verficiamos el cambio

        //eliminar 

        names.remove(2); 
        //System.out.println(names.get(2)); ERROR ya no existe lo has eliminado

        // buscar elemento 

        names.contains("Dani"); //True 
        names.contains("Daniel"); //False 
        
        //limpiar arraylist 

        names.clear(); //eliminas todo el array entero 
        System.out.println(names.size()); // 0  hemos eliminado todo el arraylist



    }
}
