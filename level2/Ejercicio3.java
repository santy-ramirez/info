package level2;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio3
 * Contiene una lista de caratas 
 */

public class Ejercicio3 {
public static void main(String [] args) {
    ArrayList<String> cartasFrancesas =  new ArrayList<String>();
    cartasFrancesas.add("2");
    cartasFrancesas.add("3");
    cartasFrancesas.add("4");
    cartasFrancesas.add("5");
    cartasFrancesas.add("6");
    cartasFrancesas.add("7");
    cartasFrancesas.add("8");
    cartasFrancesas.add("9");
    cartasFrancesas.add("10");
    cartasFrancesas.add("J");
    cartasFrancesas.add("Q");
    cartasFrancesas.add("K");
    cartasFrancesas.add("A");

    System.out.println("Estas son las cartas que tenemos:");
    for(int i=0; i < cartasFrancesas.size();i++){
        System.out.println(cartasFrancesas.get(i));
    }
    Collections.reverse(cartasFrancesas);
    System.out.println(" Las cartas  ordenados en reversa");

     for(int i=0; i < cartasFrancesas.size();i++){
        System.out.println( cartasFrancesas.get(i));
    }

    Collections.sort(cartasFrancesas);
    System.out.println("las cartas mescladas");

    for(int i=0; i < cartasFrancesas.size();i++){
        System.out.println(cartasFrancesas.get(i));
    }
    
    
}
    
}
