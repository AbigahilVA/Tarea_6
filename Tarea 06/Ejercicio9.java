import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[5];
        String[] correos = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine();

            System.out.print("Ingrese el mail de la persona " + (i + 1) + ": ");
            correos[i] = teclado.nextLine();
        }

        System.out.println("\nDatos ingresados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: " + nombres[i] + " - Mail: " + correos[i]);
        }

        System.out.print("\nIngrese un nombre para consultar su mail: ");
        String nombreBuscar = teclado.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println("El mail de " + nombres[i] + " es: " + correos[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nombre no encontrado.");
        }

        System.out.println("\nMails que no tienen el caracter @:");
        boolean hayError = false;

        for (int i = 0; i < 5; i++) {
            if (!correos[i].contains("@")) {
                System.out.println(correos[i]);
                hayError = true;
            }
        }

        if (!hayError) {
            System.out.println("Todos los mails tienen @.");
        }

        teclado.close();
    }
}
