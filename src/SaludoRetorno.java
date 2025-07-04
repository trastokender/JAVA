import java.util.Scanner;

public class SaludoRetorno {
    public static void main(String[] args){
         Scanner teclado = new Scanner(System.in);

         System.out.print("¿Cómo te llamas? ");
         String name = teclado.nextLine();
         String bienvenida = obtenerSaludo(name);
         System.out.println(bienvenida);

        System.out.print("\n¿Cuántos cafés has tomado hoy? ");
        int numero =teclado.nextInt();
        teclado.nextLine();
        String mensajeCafe = nivelCafeina(numero);
        System.out.println ("\n " + mensajeCafe);
        String masMensajes = mensajeExtra(numero);
        System.out.println ("\n " + masMensajes);

        teclado.close();
    }

    public static String obtenerSaludo(String nombre) {

        return "😊Hola, "+ nombre + ", bienvenido";
    }

    public static String nivelCafeina(int cantidad){

        String resultado;

        if (cantidad<=2) {
            resultado= ("Llevas "+cantidad+ " cafés. Nivel de Cafeina: normal");
        }else if(cantidad<=5) {
            resultado= ("Llevas "+cantidad+ " cafés. Nivel de Cafeina: alto");
        }else {
            resultado= ("Llevas "+cantidad+ " cafés. Nivel de Cafeina: ¡¡altísimo!! 😱");
        }
        return resultado;
    }

    public static String mensajeExtra(int cantidad) {
        if (cantidad>5){
           return "¡Respira hondo y evita tomar mas cafés!";
        } else {
            return "¡Sigue con energia!";
        }
    }
}
