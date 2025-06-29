import java.util.Scanner;

public class Edad2026 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        int edad = teclado.nextInt();

        edad += 1; // es una de las maneras de expresarlo. Podría decir edad= edad +1, edad =++ edad, e incluso podría declarar otra variable para representar la suma de edad +1. He puesto ese modo porque es el menos intuitivo y así lo refuerzo.

        System.out.println("El año que viene tendrás " + edad + " años.");

        teclado.close();

    }
}
