import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número  que desea saber la potencia");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el numero de la potencia");
        int numero2 = scan.nextInt();
        for (int i = 0; i < numero2; i++) {
            resultado = i == 0 ? numero1 : resultado * numero1;
        }
        System.out.println(resultado);
        scan.close();
    }
}
