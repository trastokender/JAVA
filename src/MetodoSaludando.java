import java.util.Scanner;
public class MetodoSaludando {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¡Hola!¿Cómo te llamas? ");
        System.out.println();
        String nombre = teclado.nextLine();
        saludarUsuario(nombre);
    }
    public static void saludarUsuario (String nombre) {
        System.out.println("Hola, "+nombre+", bienvenido al programa.");
    }
}
