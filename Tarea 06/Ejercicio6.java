import java.util.Scanner;

class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    public void imprimirImpuesto() {
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos.");
        } else {
            System.out.println("No debe pagar impuestos.");
        }
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldo = teclado.nextDouble();

        Empleado empleado = new Empleado(nombre, sueldo);
        empleado.imprimirDatos();
        empleado.imprimirImpuesto();

        teclado.close();
    }
}
