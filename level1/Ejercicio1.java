
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese su nombre: "); 
        String nombre = scan.next();
        System.out.println("ingrese su apellido: "); 
        String apellido = scan.next();

        System.out.println("Hello, " + nombre + " " + apellido); 
        
        scan.close();
    };
    
};