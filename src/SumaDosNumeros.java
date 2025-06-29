import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un número: ");
        int num1 = teclado.nextInt();

        System.out.print("Dame otro número: ");
        int num2 = teclado.nextInt();
        // si ahora tuviéramos que recoger un texto por teclado sería encesari vaciar el búfer antes con teclado.nextLine()
        int suma = num1 + num2; //Me gusta más declarar la variable suma y asignarle su valor aquí y no al imprimirla por pantalla

        System.out.println("La suma es: " + suma);

        teclado.close();
    }

}
