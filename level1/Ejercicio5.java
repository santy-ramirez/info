import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número para multiplicar");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo número para multiplicar");
        int numero2 = scan.nextInt();
        for (int i = 0; i < numero2; i++) {
            resultado = i == 0 ? numero1 : resultado + numero1;
        }
        System.out.println(resultado);
        scan.close();
    }
}
