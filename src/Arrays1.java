import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i=0; i<nombres.length; i++) {

            System.out.print("Dame un nombre " +(i + 1) +". ");
            nombres[i] = teclado.nextLine();
        }

        System.out.println("Nombres guardados:");
        for(int i=0; i<nombres.length; i++){
            System.out.println("Nombre " +(i + 1)+ ": " + nombres[i]);

        }
    teclado.close();

    }

}
