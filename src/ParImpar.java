import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un número: ");
        int num = teclado.nextInt();
        if (num%2==0) { // También podríamos declarar la variable modulo y asignarle el valor del modulo de num entre 2.
                        // Después la condición del if sería (modulo==0)
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
        teclado.close();
    }
}