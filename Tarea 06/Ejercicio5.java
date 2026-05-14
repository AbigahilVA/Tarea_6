import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[2][5];

        for (int columna = 0; columna < 5; columna++) {
            for (int fila = 0; fila < 2; fila++) {
                System.out.print("Ingrese valor para fila " + fila + ", columna " + columna + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }

        System.out.println("Matriz ingresada:");
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        teclado.close();
    }
}
