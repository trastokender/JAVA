import java.util.Scanner; //Importamos la clase

public class ComparaColores { //Declaramos la clase
    public static void main(String[] args) { //Declaramos el método
        Scanner teclado = new Scanner(System.in); //Declaramos el objeto

        System.out.print("Escribe un color: ");
        String dacolor = teclado.next();
         String color =dacolor.toLowerCase();

        if (color.equals("rojo")) {
            System.out.println("Color de energía");
        } else if (color.equals("azul")) {
            System.out.println("Color de tranquilidad");
        } else if (color.equals("verde")) {
            System.out.println("Color de naturaleza");
        } else {
            System.out.println("Color no clasificado");
        }
    teclado.close();
    }

}