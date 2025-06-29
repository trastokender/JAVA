import java.util.Scanner; //Importamos la clase Scanner

public class PedirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creamos el objeto Scanner

        System.out.println("Dame un numero entero: ");
        int numero = scanner.nextInt(); // Capturamos el número ingresado

        System.out.println("El número es: " + numero); // Mostramos el número

        scanner.close(); //Cerramos el Scanner
    }
}
