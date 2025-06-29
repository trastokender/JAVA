import java.util.Scanner; //Importamos la clase

public class Edades { //Declaramos la clase
    public static void main(String[] args) { //Declaramos el método
        Scanner teclado = new Scanner(System.in); //Declaramos el objeto

        System.out.print("Dime tu edad: "); //Pedimos el dato

        int edad = teclado.nextInt(); //Recogemos el dato

        System.out.println("\nHas dicho que tienes "+edad+ " años.");

        if (edad <0 || edad >120) { // edades absurdas
            System.out.println("Esa edad no es válida. Ejecuta de nuevo el programa e introduce una edad realista");
        } else if (edad >=65) { //comparamos
            System.out.println("Eres un adulto mayor");
        } else if (edad >=18) {
            System.out.println("Eres un adulto");
        } else if (edad >=13) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
        teclado.close(); //Cerramos el objeto
    }

}
