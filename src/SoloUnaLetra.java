import java.util.Scanner;

public class SoloUnaLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe solo un carácter: ");
        String entrada = sc.nextLine();

        if (entrada.length() == 1) {
            char letra = entrada.charAt(0);
            System.out.println("Has escrito: '" + letra + "'");

        }else if (entrada.isEmpty()) {
            System.out.println("No has escrito nada.");

        }else {
            System.out.println("Error: Has escrito más de un carácter.");
        }
    sc.close();
    }
}
