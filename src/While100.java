import java.util.Scanner;

public class While100 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0;
        while (num<=100) {
            System.out.print("Dime un nº mayor que 100: ");
            num = teclado.nextInt(); //no hay que declararlo d nuevo, así que obviamos el "int", porque daria error.
            teclado.nextLine();
        }
        System.out.println("¡Gracias! Has introducido un número válido");
    teclado.close();
    }
}
