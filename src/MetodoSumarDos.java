import java.util.Scanner;

public class MetodoSumarDos {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.print("Dame un nº: ");
        int num1= teclado.nextInt();
        System.out.print("Dame otro nº: ");
        int num2= teclado.nextInt();

        int suma=sumar(num1,num2);
        System.out.println("La suma de los dos nº es: " + suma);
        teclado.close();
    }
    public static int sumar(int a, int b) {
        int suma =a + b;
        return suma;

    }
}
