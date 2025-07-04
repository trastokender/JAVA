import java. util.Scanner;

public class ForConLimite {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un nº: ");
        int limite = teclado.nextInt();
        teclado.nextLine();
        int suma=0;

        // Bucle del 1 al (límite-1) para que el signo "+" salga detrás de todos menos del último nº
        for (int i=1; i<limite;i++) {
            System.out.print (i +" + ");
            suma+=i;
        }

        // ponemos el último nº, el "=" y la suma
        System.out.print(limite + " = ");
        suma= suma+limite;
        System.out.println (suma);

    teclado.close();
    }
}
