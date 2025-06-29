import java.util.Scanner;

public class PidePalabra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame una palabra: ");
        String palabra =teclado.next();
        System.out.print("La palabra es: " + palabra + ". Ahora, dame otra palabra y te diré cual es su segunda letra: ");
        char letra = teclado.next().charAt(1);
        System.out.println("La segunda letra es: " + letra); //Has de explicarme como sacar la priemra o segunda letra de una palabra una vez introducida por teclado

        teclado.close();
    }
}
