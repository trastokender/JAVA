import java.util.Scanner;

public class precio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el precio: ");
        float precio = teclado.nextFloat();

        System.out.println("El precio introducido es: " + precio + " euros");

        teclado.close();
    }
}
