import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingese la palabra a convertir en mayúscula: ");
        String palabra = scan.nextLine();
        int tamaño = palabra.length();
        char[] caracteres = palabra.toCharArray();
        for(int i = 0; i < tamaño; i++) {
            char caracter = caracteres[i];
            if (caracter >= 'a' && caracter <= 'z') {
                caracter = (char)(caracter - ('a' - 'A'));
                System.out.print(caracter);
            } else {
                System.out.print(caracter);
            }
        }
        System.out.println("");
        scan.close();
    }
}
