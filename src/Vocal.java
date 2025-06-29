import java.util.Scanner;

public class Vocal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una letra ");

        char letra =teclado.next().charAt(0);
        char letraMayus = Character.toUpperCase(letra);
        System.out.println( "La letra que has puesto es la letra "+letraMayus);
        if (letraMayus=='A' || letraMayus=='E' || letraMayus=='I' || letraMayus=='O' || letraMayus=='U') { // Aquí no hay una forma más simple y menos repetitiva, sin salir del If puro?
            System.out.println("¡Has introducido una vocal!");
        }

        teclado.close();
    }
}