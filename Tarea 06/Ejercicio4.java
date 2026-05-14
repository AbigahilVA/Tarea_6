import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[10];
        boolean ordenado = true;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (vector[i] > vector[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("El vector esta ordenado de menor a mayor.");
        } else {
            System.out.println("El vector no esta ordenado de menor a mayor.");
        }

        teclado.close();
    }
}
