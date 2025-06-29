import java.util.Scanner;

public class AreaRectángulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame la base del rectángulo (en centímetros): ");
        double base = teclado.nextDouble();
        System.out.print("Dame la altura del rectángulo (en centímetros): ");
        double altura = teclado.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area + " centímetros cuadrados");

        teclado.close();

    }

}
