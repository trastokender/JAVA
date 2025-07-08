import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        int secreto = generador.nextInt(10) +1;     // (10)nos da un número aleatorio entre 0 y 9, le sumamos 1 a cada uno
        // de esos números y así tenemos un nº entre 1 y 10

        System.out.println("\n ¡Bienvenido al juego: Adivina el número!");
        System.out.print("Elige un número del 1 al 10: ");
        int intento = teclado.nextInt();
        teclado.nextLine();

        comprobar(intento, secreto);

        teclado.close();
    }

    public static void comprobar(int intento, int secreto) {
        if(intento==secreto) {
            System.out.println("\n ¡Correcto! Has adivinado el número.");
        } else {
            System.out.println ("\n Lo siento... El número era el " + secreto + ".");
        }
    }
}
