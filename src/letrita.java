import java.util.Scanner;

public class letrita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("escribe una palabra o frase: ");
        String texto = scan.nextLine();

        System.out.println("Caracteres por posición: ");
        for (int i=0; i<texto.length(); i++) {
            char letra = texto.charAt(i);
            System.out.println("posición " + i + ": " + letra);
        }
        scan.close();
    }
}
