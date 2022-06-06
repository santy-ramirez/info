import java.util.Scanner;

public class Ejercicio3 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scan.nextInt();
        for(int i = 0; i <= numero; i++){
            for(int b = 1; b <= i; b ++) {
                System.out.print(b);
            }
            System.out.println("");
        }
        scan.close();
    }  
}
