import java.util.Scanner;

public class LetrasPalabra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos y recogemos la palabra por teclado
        System.out.print("Dame un texto: ");
        String texto =teclado.nextLine();
        if (texto.contains(" ")) {
            System.out.println("Has puesto más de una palabra.");
        } else {
            System.out.println("Has puesto una sola palabra.");
        }
        int letras =texto.length();
        // Imprimimos el nº de letras que tiene (incluido los espacios??)
        System.out.println("El texto "+ texto + " tiene " +letras+ " letras.");
        //Queremos saber si el texto contiene las letras 'x' o 'z' para decir que han detectado un carácter especial si es así.
        //Pasamos el texto a minúsculas:
        String palabraMinuscula= texto.toLowerCase();
        // buscamos la 'x' o la 'z', como el método CONTAINS solo funciona con STrings, usaremos comillas dobles
        if (palabraMinuscula.contains("x") || palabraMinuscula.contains("z")) {
            System.out.println("Se ha detectado que este texto tiene algún carácter especial");
        }
        //Sacamos la primera y la última letra de la palabra
        char inicial =texto.charAt(0); //Primera letra ¿Podríamos usar la expresión palabra.charAt(palabra.length() 0)?
        char ultima = texto.charAt(texto.length() -1); //última letra
        //Pasamos a minúsculas las letras inicial y ultima de la palabra. Aunque igual no hace falta porque ya hemos pasado a minúsculas toda la palabra em el paso anterior
        inicial = Character.toLowerCase(inicial);
        ultima = Character.toLowerCase(ultima);
        //comparamos para ver si la primera letra es vocal
        if (inicial=='a' || inicial =='e' || inicial =='i' || inicial == 'o' || inicial =='u') {
            System.out.println("Comienza por vocal. ");
        }
        //Comparamos para ver si la última letra es vocal
        if (ultima=='a' || ultima =='e' || ultima =='i' || ultima == 'o' || ultima =='u') {
            System.out.println("Acaba en vocal. ");
        }
        teclado.close();

    }

}
