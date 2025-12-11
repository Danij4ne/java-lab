package collections;

import java.util.ArrayList;
import java.util.HashSet;

//unicamente almacena datos unicos (no admite repetidos ) y no estan ordenados los datos siempre estan en posiciones diferentes
//set es muy obtimo para buscar elementos dentro del propio set 
public class TheSets {
    public static void main(String[] args) {
        
        //declaracion y creacion

        HashSet<String> names = new HashSet<>();


        //declaracion y creacion moderna con int + variable 

        var numbers = new HashSet<Integer>(); 



        //tamaño 

        System.out.println(names.size());


         //añadir elementos 

        names.add("Dani");
        names.add("Jane");
        names.add("Danij4ne");
        System.out.println(names.size());


        //buscar elementos 

        names.contains("Dani"); //True 
        names.contains("Daniel"); //False 


        //eliminar elementos 

        names.remove("Dani"); //le dices directamente el nombre del elemento que quieres borrar
        System.out.println(names.size()); // el size sera 1 menos porque hemos eliminado una variable con remove

        //names.addAll(numbers); Error 

        var countries = new HashSet<String>(); // creamos un nuevo set

        //añadimos elementos 

        countries.add("España");
        countries.add("Mexico");
        countries.add("Argentina");
        
        names.addAll(countries);  // añadimos todos los elementos de countries a names 

        System.out.println(names);

        //eliminar elementos 

        names.removeAll(countries); //elimina todos los elementos que habiamos fusioando de countries 








    }
    

}
