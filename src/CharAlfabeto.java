import java.util.Scanner;

public class CharAlfabeto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una letra ");

        char letra =teclado.next().charAt(0); //Recuerda que la primera posición es 0 y no 1
        if (letra=='A' || letra=='a') { // Aquí no podríamos poner if (letra.equalsIgnoreCase('A'))?
            System.out.println("Empieza por la primera letra del alfabeto");
        }

        teclado.close();
    }
}
