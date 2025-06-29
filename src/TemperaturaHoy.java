import java.util.Scanner;

public class TemperaturaHoy {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la temperatura de hoy: ");
        double temp =teclado.nextDouble();

        if (temp>25)
        {
           System.out.println("¡Hace calor hoy! ¡Estamos a " + temp + " grados!");

        }
        teclado.close();
    }
}
