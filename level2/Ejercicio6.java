package level2;
import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();
        empleado.add(new Employee("Santiago Ramirez", 94537816, 8, 550));
        empleado.add(new Employee("Miguel Ramirez", 54642124, 6, 350));
        empleado.add(new Employee("Maria Aquino", 87645210, 4, 600));
        empleado.add(new Employee("Juan Gonzalez", 24687368, 7, 345));
        empleado.add(new Employee("Nelsy Acuña", 798546310, 5, 320));

        System.out.println("Calculo del salario de los empleados");

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario percibido:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
    
}
