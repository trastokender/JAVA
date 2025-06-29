import java.util.Scanner;

public class PideDeTodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre =teclado.nextLine();

        System.out.print("edad: ");
        int edad = teclado.nextInt();

        System.out.print("¿Tienes carnet?: ");
        boolean carnet =teclado.nextBoolean();

        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Carnet: " + carnet);

        teclado.close();
    }
}
