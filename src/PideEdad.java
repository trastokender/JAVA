import java.util.Scanner;

public class PideEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Tienes " + edad + " años.");

        teclado.close();
    }

}
