package level2;
import java.util.ArrayList;

    
public class Ejercicio1 {
    public static void main (String[] args) {
        ArrayList<String>  ciudades = new ArrayList<String>();
        ciudades.add("#1 las garcitas");
        ciudades.add("#2 Neuquen");
        ciudades.add("#2 Bariloche"); 


        for (String i:ciudades){
            System.out.println(i);
        }
        
    }
}