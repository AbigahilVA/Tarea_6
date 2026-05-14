import java.util.Scanner;

class Operaciones {
    private int valor1;
    private int valor2;

    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar() {
        return valor1 + valor2;
    }

    public int restar() {
        return valor1 - valor2;
    }

    public int multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
        return (double) valor1 / valor2;
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int valor2 = teclado.nextInt();

        Operaciones op = new Operaciones(valor1, valor2);

        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicacion: " + op.multiplicar());

        if (valor2 != 0) {
            System.out.println("Division: " + op.dividir());
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        teclado.close();
    }
}
