import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDame un nº: ");
        int num1 = teclado.nextInt();
        System.out.print("\n Dame otro nº: ");
        int num2 = teclado.nextInt();

        int resta = restando(num1, num2);
        String mensaje =(resta>=0)? "Positivo" : "Negativo";
        System.out.println("\n el resultado de la resta es: " + mensaje);


    }

    public static int restando(int a, int b) {
        int resultado= a-b;
        return resultado;
    }


}
