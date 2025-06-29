import java.util.Scanner;

public class LongitudPalabra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Dame otro número: ");
        int num2 = teclado.nextInt();

        int suma= num1+num2;
        System.out.println("La suma de los dos números es: " + suma);
        int resta=num1-num2;
        System.out.println("La resta de los dos números es: " + resta);
        int producto=num1*num2;
        System.out.println("El producto de los dos números es: " + producto);
        if (num2 != 0) {
            int cociente = num1 / num2;
            System.out.println("El cociente entero de los dos números es: " + cociente);
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        teclado.close();
    }
}