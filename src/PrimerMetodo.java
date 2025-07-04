import java.util.Scanner;

public class PrimerMetodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\n¿Cuántos cafés has tomado hoy? ");
        int numero =teclado.nextInt();
        teclado.nextLine();

        System.out.print("\n¿Cómo te llamas? ");
        String nombre = teclado.nextLine();

        saludo(nombre);
        dia("por la mañana");
        java("principiante");
        cafes(numero);

        teclado.close();

    }
    public static void saludo(String nombre){
        System.out.println("\n😊Hola, "+ nombre+" , bienvenido.");
    }
    public static void dia(String jornada) {
        System.out.println("\n✅Hoy es un gran día "+jornada+ "." );
    }
    public static void java(String nivel) {
        System.out.println("\n¡Bienvenido al curso de Java" + nivel +"!.👋 ");
    }
    public static void cafes(int cantidad) {
        System.out.println("\n Llevas ya tomados " + cantidad + " cafés.☕☕");
    }
}
