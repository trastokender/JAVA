import java.util.Scanner;

public class ElegirNumero {
    public static void main(String[] args ) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Elige un número del 1 al 5: ");
        int num =teclado.nextInt();

        switch (num) {
            case 1:
                System.out.println("Has elegido uno");
                break;
            case 2:
                System.out.println("Has elegido dos");
                break;
            case 3:
                System.out.println("Has elegido tres");
                break;
            case 4:
                System.out.println("Has elegido cuatro");
                break;
            case 5:
                System.out.println("Has elegido cinco");
                break;
            default:
                System.out.println("Número fuera de rango");
                break;
        }
    teclado.close();
    }
}
