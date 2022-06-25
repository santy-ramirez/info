import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingese su Nombre y Apellido");
        String nombre = scan.nextLine();
        System.out.println("Ingese su Edad");
        String edad = scan.nextLine();
        System.out.println("Ingese su Dirección");
        String direccion = scan.nextLine();
        System.out.println("Ingese su Ciudad");
        String ciudad = scan.nextLine();
        System.out.printf("%s - %s - %s - %s", ciudad, direccion, edad, nombre);
        System.out.println("");
        scan.close();
    }
}
