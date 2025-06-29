import java.util.Scanner;

public class FichaPersonal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("edad: ");
        int edad = teclado.nextInt();

        System.out.print("altura: ");
        float altura = teclado.nextFloat();

        teclado.nextLine(); //Limpiamos bufer

        System.out.print("¿Carnet? (sí/no): ");
        String respuesta = teclado.nextLine().toLowerCase(); //pasamos a minúsculas

        boolean carnet = respuesta.equals("si") || respuesta.equals("sí"); //Preguntamos al progfama comparando con lo escrito (tanto si es "si" (sin acento), como si es "sí" (con acento).

        System.out.println("nombre: " + nombre + ", Edad: " + edad + ", altura: " + altura + ". Carnet: " + carnet + ".");
        System.out.println("Dicho de otro modo: ");
        System.out.println("\n--- Ficha personal ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Carnet: " + carnet);

        teclado.close();
    }
}
