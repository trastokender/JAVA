import java.util.Scanner;

public class ComparadorTexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();

        if (palabra.equals("java")) {
            System.out.println("¡Has escrito 'java' tal cual!");
        }
        if (palabra.contains ("va")) {
            System.out.println("La palaba contiene 'va'.");
        }
        if (palabra.startsWith("ja")) {
            System.out.println("La palabra comienza con 'ja'.");
        }
        if (palabra.endsWith("a")) {
            System.out.println("la palabra acaba en 'a'.");
        }
        else {
            System.out.println("No esperaba una palabra que no acabara en 'a', la verdad...");
        }

        teclado.close();
    }

}
