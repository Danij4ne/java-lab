package collections;

import java.util.ArrayList;
import java.util.HashSet;

//only stores unique data (does not allow duplicates) and data is not ordered, elements are always in different positions
//set is very efficient for searching elements inside the set
public class TheSets {
    public static void main(String[] args) {
        
        //declaration and creation

        HashSet<String> names = new HashSet<>();


        //modern declaration and creation with int + variable 

        var numbers = new HashSet<Integer>(); 



        //size 

        System.out.println(names.size());


         //add elements 

        names.add("Dani");
        names.add("Jane");
        names.add("Danij4ne");
        System.out.println(names.size());


        //search elements 

        names.contains("Dani"); //True 
        names.contains("Daniel"); //False 


        //remove elements 

        names.remove("Dani"); //you directly specify the name of the element you want to delete
        System.out.println(names.size()); //the size will be 1 less because we removed an element with remove

        //names.addAll(numbers); Error 

        var countries = new HashSet<String>(); //we create a new set

        //add elements 

        countries.add("España");
        countries.add("Mexico");
        countries.add("Argentina");
        
        names.addAll(countries);  //we add all elements from countries to names

        System.out.println(names);

        //remove elements 

        names.removeAll(countries); //removes all elements that we previously merged from countries

    }
    

}
