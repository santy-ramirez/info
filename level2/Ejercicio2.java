package level2;
import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args) {
      ArrayList<Integer> numeroEntero = new ArrayList<Integer>();
      numeroEntero.add(1);
      numeroEntero.add(2);
      numeroEntero.add(3);
      numeroEntero.add(4);
      numeroEntero.add(5);
      numeroEntero.add(6);

     for (int i = 0; i < numeroEntero.size(); i++){
         System.out.println("numero en la lista: "+ numeroEntero.get(i));
     }

     System.out.println("numero en la lista actual: "+ numeroEntero.size());
     numeroEntero.remove(0);
     numeroEntero.remove(4);
     System.out.println("numero en la lista, despues de sacar algunos numeros: "+ numeroEntero.size());


     
  }  
}
