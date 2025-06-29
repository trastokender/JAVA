import java.util.Scanner;

public class ColorUsuario {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime un color ");
    String color =teclado.nextLine();

    if (color.equalsIgnoreCase("rojo")) {
        System.out.println("Color peligroso detectado");
    }
        System.out.println("Color detectado: " + color);

    teclado.close();
    }
}
