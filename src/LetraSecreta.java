//Importamos la clase Scanner
import java.util.Scanner;
//Declaramos la clase
public class LetraSecreta {
    //Declaramos main
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Creamos el objeto teclado a partir de la clase Scanner
        //Solicitamos la letra
        System.out.print("Dame una letra: ");
         char letra= teclado.next().charAt(0); //como no podemos recoger una letra, recogemos una palabra y sacamos la letra
         char letraMinus= Character.toLowerCase(letra); //Pasamos la letra a minúscula.

        // Mostramos la letra introducida
        System.out.println("La letra introducida es " + letraMinus + ". ");

        if (letraMinus =='x') {              //Comparamos la letra con x
            System.out.println("Letra secreta detectada."); //Si son iguales, mostramos el mensaje
        } else {
            System.out.println("Letra corriente"); //Si no lo son, mostramos este otro mensaje
        }
        teclado.close();
    }

}
