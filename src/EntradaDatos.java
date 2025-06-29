import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Pon tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Pon tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("hola, " + nombre + ". Tienes " + edad + " años.");

        teclado.close();

    }


}
