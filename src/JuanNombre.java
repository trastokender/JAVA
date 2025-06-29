import java.util.Scanner; //Importamos la clase Scanner

public class JuanNombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //creamos el objeto de clase Scanner

        System.out.print("Tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("tu edad:  ");
        int edad = teclado.nextInt();

        teclado.nextInt();

        System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");

        teclado.close();

    }
}
