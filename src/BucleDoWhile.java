import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x;

        do {
            System.out.println("Elige una opción del menú:");
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Salir");

            x = teclado.nextInt();
            }
        while (x != 3) ;

        teclado.close();
    }
}
