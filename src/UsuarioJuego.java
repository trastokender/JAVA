import java.util.Scanner;

public class UsuarioJuego {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primera jugada ¿Cuántos puntos has sacado?: ");
        int puntos = teclado.nextInt();

        if (puntos>=90) {
            System.out.println("Has sacado " + puntos + " puntos en tu primera tirada. ¡Felicidades, has ganado un premio!");
        }


        System.out.print("Segunda jugada ¿Cuántos puntos has sacado?: ");
        int puntos2 = teclado.nextInt();

        if (puntos2>=90) {
            System.out.println("Has sacado " + puntos2 + " puntos en la segunda tirada. ¡Felicidades, has ganado un premio!");
        }

        int media=(puntos+puntos2)/2;

        if (media>=90) {
            System.out.println("Has sacado " + media + " puntos de media. ¡Felicidades, has ganado un premio gigante!");
        }
        if (media>=100) {
            System.out.println("¡¡Puntuación perfecta!!");
        }
        teclado.close();
    }

}
