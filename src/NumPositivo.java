import java.util.Scanner;

public class NumPositivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0;
        while (num<=0) {
            System.out.print("Dime un nº positivo: ");
            num = teclado.nextInt(); //no hay que declararlo d nuevo, así que obviamos el "int", porque daria error.
            teclado.nextLine();
        }
        System.out.println("¡Gracias!");
        teclado.close();
    }
}
