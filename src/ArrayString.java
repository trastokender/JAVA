import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.print("¿Cuántas frutas quieres introducir?: ");
        int cantidad = teclado.nextInt();

        teclado.nextLine(); //Limpiamos búfer

        String[] frutas = new String[cantidad]; // Creamos un array de nombres de frutas;

        for(int i=0; i<frutas.length;i++){
            System.out.print("Dime un nombre de fruta: ");
            frutas[i] =teclado.nextLine();

        }

        for(int i=0; i<frutas.length; i++){
            System.out.println("Fruta en la posición " + (i + 1) + ": " + frutas[i]);
        }
        teclado.close();
    }
}

