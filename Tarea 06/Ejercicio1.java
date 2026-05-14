import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[8];
        int sumaTotal = 0;
        int sumaMayores36 = 0;
        int cantidadMayores50 = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();

            sumaTotal += vector[i];

            if (vector[i] > 36) {
                sumaMayores36 += vector[i];
            }

            if (vector[i] > 50) {
                cantidadMayores50++;
            }
        }

        System.out.println("Valor acumulado de todos los elementos: " + sumaTotal);
        System.out.println("Valor acumulado de los elementos mayores a 36: " + sumaMayores36);
        System.out.println("Cantidad de valores mayores a 50: " + cantidadMayores50);

        teclado.close();
    }
}
