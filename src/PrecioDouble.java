import java.util.Scanner;
import java.util.Locale;

public class PrecioDouble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);// obligamos a usar el punto decimal

        System.out.print("Introduce el precio: ");
        double precio = teclado.nextDouble();

        System.out.println("El precio introducido es: " + precio);

        teclado.close();
    }
}
