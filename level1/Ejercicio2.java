import java.util.Scanner;

public class Ejercicio2 {
public static void main (String[] args){
    System.out.println("ingrese el primer nú2mero");
    Scanner scan = new Scanner(System.in);
    int numero1 = scan.nextInt();

    System.out.println("ingrese elsegundo número");
    int numero2 = scan.nextInt();

    System.out.println("la suma de los dos numeros es: " + (numero1 + numero2));
    System.out.println("la  resta de los dos numeros es: " + (numero1 - numero2));
    System.out.println("la division de los dos numeros es: " + (numero1 / numero2));
    System.out.println("el modulo de los dos numeros es: " + (numero1 % numero2));
    System.out.println("la multiplicacion de los dos numeros es: " + (numero1 * numero2));


    scan.close();  

}    
  
}
