import java.util.Scanner; //Importamos la clase

public class FraseColor { //Declaramos la clase
    public static void main(String[] args) { //Declaramos el método
        Scanner teclado = new Scanner(System.in); //Declaramos el objeto

        System.out.print("Escribe una frase que incluya un color: ");
        String fraseColor = teclado.nextLine();
        String oracion =fraseColor.toLowerCase();

        if (oracion.contains("rojo")) {
            System.out.println("Has mencionado el color de la energía");
        } else if (oracion.contains("azul")) {
            System.out.println(" Has mencionad el color de la tranquilidad");
        } else if (oracion.contains("verde")) {
            System.out.println("Has mencionado el color de la naturaleza");
        } else {
            System.out.println("NO he detectado en tu frase ningun color básico (rojo, azul o verde)");
        }
        teclado.close();
    }

}
