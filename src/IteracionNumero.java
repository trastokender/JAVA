import java.util.Scanner;

public class IteracionNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un número menor que 20 y lo iremos aumentando uno a uno hasta el 20");
        int contador = teclado.nextInt();
        teclado.nextLine(); //vaciamos bufer por si acaso queremos coger algún  string después
        //bucle while
        while (contador<=20) {
            System.out.println("Iteración número: " + contador);
            contador++; //incrementa para que vaya corriendo y evitar un bucle infinito
        }
    teclado.close();
    }
}
