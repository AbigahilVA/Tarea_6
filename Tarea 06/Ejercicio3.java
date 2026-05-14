import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] cursoA = new int[5];
        int[] cursoB = new int[5];
        int sumaA = 0;
        int sumaB = 0;

        System.out.println("Ingrese las notas del curso A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota alumno " + (i + 1) + ": ");
            cursoA[i] = teclado.nextInt();
            sumaA += cursoA[i];
        }

        System.out.println("Ingrese las notas del curso B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota alumno " + (i + 1) + ": ");
            cursoB[i] = teclado.nextInt();
            sumaB += cursoB[i];
        }

        double promedioA = (double) sumaA / 5;
        double promedioB = (double) sumaB / 5;

        System.out.println("Promedio del curso A: " + promedioA);
        System.out.println("Promedio del curso B: " + promedioB);

        if (promedioA > promedioB) {
            System.out.println("El curso A obtuvo el mayor promedio general.");
        } else if (promedioB > promedioA) {
            System.out.println("El curso B obtuvo el mayor promedio general.");
        } else {
            System.out.println("Ambos cursos tienen el mismo promedio.");
        }

        teclado.close();
    }
}
