import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una letra ");
         char letra =teclado.next().charAt(0); //Lee el primer caracter de la palabra

        System.out.println("la latra es: " + letra);


       teclado.close();
    }
}
