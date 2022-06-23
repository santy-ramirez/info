import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto, por favor:");
        String texto = scan.nextLine();
        System.out.println("Escriba la letra a buscar:");
        String letra = scan.nextLine();
        char caracter = letra.charAt(0);
        int cont = contarCaracteres(texto, caracter);
        System.out.printf("la letra < %s > se repite %s veces", caracter, cont);
        System.out.println("");
        scan.close();
    }

    public static int contarCaracteres(String texto, char caracter){
        int pos = 0;
        int cont = 0;
        pos = texto.indexOf(caracter);
        while (pos != -1) {
            cont++;
            pos = texto.indexOf(caracter, pos + 1);
        }
        return cont;
    }
}
