import java.util.Scanner;

public class FraseEntera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Pon una cita famosa o ingeniosa: ");
        String frase = teclado.nextLine();
        int letras = frase.length();

        System.out.println(" La frase es genial y tiene " + letras + " letras");

        teclado.close();

    }
}
