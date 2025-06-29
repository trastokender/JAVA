import java.util.Scanner;  //importa la clsse Scanner

public class PesoAltura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Creamos el objeto teclado

        System.out.print("Peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        System.out.println("Tu peso es " + peso + "kg y tu altura es " + altura + " metros.");

        teclado.close();
    }
}
