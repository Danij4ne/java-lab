package basics;

public class ConstantsVariables {
    public static void main(String[] args) {
        
   
         //Variables 

        String name = "Dani";
        System.out.println(name);

        name = "Daniel"; // cambiamos el valor de name y no hay ningun problema podemos hacerlo
        //name = 7 ; Da ERROR , porque una variable que hemos definido como String no podemos cambiarla a int ya que java es de tipado fuerte

        int age = 37;
        System.out.println(age);

        var year = 2025 ; // creamos una variable con var y el propio sistema detecta cual es el tipo de dato


        // Constantes 

        final String email = "mouredev@gmai.com";  // este email ya no se podra definir ni intentar cambiar ya que es constante
        final int NUMBER = 44 ; // es buena practica a la hora de crear una constante ponerla todo en mayusculas


 }
    
}
