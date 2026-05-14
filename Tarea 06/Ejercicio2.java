import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] vector3 = new int[4];

        System.out.println("Ingrese los valores del primer vector:");
        for (int i = 0; i < 4; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = teclado.nextInt();
        }

        System.out.println("Ingrese los valores del segundo vector:");
        for (int i = 0; i < 4; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = teclado.nextInt();
        }

        System.out.println("Suma de vectores:");
        for (int i = 0; i < 4; i++) {
            vector3[i] = vector1[i] + vector2[i];
            System.out.println("vector3[" + i + "] = " + vector3[i]);
        }

        teclado.close();
    }
}
