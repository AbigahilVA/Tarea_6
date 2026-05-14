import java.util.Scanner;

public class Ejercicio8 {

    public static String primeraMitad(String cadena) {
        return cadena.substring(0, cadena.length() / 2);
    }

    public static char ultimoCaracter(String cadena) {
        return cadena.charAt(cadena.length() - 1);
    }

    public static String inversa(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

    public static String conGuiones(String cadena) {
        String texto = "";
        for (int i = 0; i < cadena.length(); i++) {
            texto += cadena.charAt(i);
            if (i != cadena.length() - 1) {
                texto += "-";
            }
        }
        return texto;
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static boolean esCapicua(String cadena) {
        String texto = cadena.replace(" ", "").toLowerCase();
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return texto.equals(invertida);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = teclado.nextLine();

        System.out.println("Primera mitad: " + primeraMitad(cadena));
        System.out.println("Ultimo caracter: " + ultimoCaracter(cadena));
        System.out.println("Inversa: " + inversa(cadena));
        System.out.println("Separada con guiones: " + conGuiones(cadena));
        System.out.println("Cantidad de vocales: " + contarVocales(cadena));

        if (esCapicua(cadena)) {
            System.out.println("La cadena se lee igual en ambas direcciones.");
        } else {
            System.out.println("La cadena no se lee igual en ambas direcciones.");
        }

        teclado.close();
    }
}
