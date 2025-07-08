import java.util. Scanner;

public class sumandoMas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\n Dame un nº: ");
        int num1 = teclado.nextInt();
        System.out.print("\n Dame otro nº: ");
        int num2 = teclado.nextInt();
        int resultado =suma(num1, num2);
        System.out.println("\n El resultado de la suma es: "+resultado);

        teclado.close();
    }

    public static int suma(int a, int b){
        int suma;
        suma = a + b;
        return suma; //Podriamos haber enviado directamente return a + b, sin declarar una variable intermediaria (suma) pero prefiero la claridad que la eficiencia.
    }
}
