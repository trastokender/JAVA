import java.util.Scanner;

public class IfBooleano {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Tu dispositivo está conectado? (true para sí, False para no )");
        boolean conectado =teclado.nextBoolean();
         if (conectado== true) {
             System.out.println("Dispositivo conectado");
         }
        teclado.close();
    }

}
