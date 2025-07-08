import java.util.Scanner;

public class BooleanRetornoMetodo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("\n Dame un nº entero: ");
        int num =teclado.nextInt();

        boolean par= esPar(num);
        if (par) {
            System.out.println("\n El número es par.");
        }else {
            System.out.println("\n El número es impar.");
        }

        teclado.close();
    }

    public static boolean esPar (int a) {
        return a%2==0; /*aquí he preferido la eficiencia que la claridad, pero soy consciente de que hubiera podido
        crear una variable boolean "modulo" y haber hecho la compración, incluso haber hehco un if de una variable Int,
        pero eso era complicarlo más. esta vez, lo elijo así.*/

    }
}
