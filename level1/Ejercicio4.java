import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        int resultado = 1;
    System.out.println("Ingrese el numero para calcular el factorial");

    Scanner scan = new Scanner(System.in);
    int numero = scan.nextInt();

    for(int i = numero; i > 0; i--) {
        resultado = resultado * i;
    }

    System.out.println("El factorial de " + numero + " es: " + resultado);
    scan.close();
    }
}
