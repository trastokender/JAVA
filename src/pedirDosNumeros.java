import java.util.Scanner;

public class pedirDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un nº: ");
        int num1 = scanner.nextInt();

        System.out.print("Dame otro nº: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma + "\n");

        System. out. println("¡Gracias!");
        scanner.close();
    }
}
