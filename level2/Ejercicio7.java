import java.util.*;
public class Ejercicio7 {
    public static void main(String args[]) {
        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList();
        Scanner numIngresado = new Scanner(System.in);
        System.out.println("Ingrese su primer número, que sea del menor: ");
        num1 = numIngresado.nextInt();
        numIngresado.nextLine();
        System.out.println("Ingrese su segundo número, el más grande: ");
        num2 = numIngresado.nextInt();
        numIngresado.nextLine();

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sumaTotal.add(i + ". FizzBuzz");
            } else if (i % 3 == 0) {
                sumaTotal.add(i + ". Buzz");
            } else if (i % 2 == 0) {
                sumaTotal.add(i + ". Fizz");
            } else {
                System.out.println("Numero no multiplo de 2 ni de 3");
            }

        }
        for (int j = 0; j < sumaTotal.size(); j++) {
            System.out.println(sumaTotal.get(j));

        }
    }  
}
