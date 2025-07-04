import java.util.Scanner;

public class ParesBoolean {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un nº entero: ");

        int num =teclado.nextInt();
        boolean parImpar = esPar(num);
        System.out.println("la respuesta es: "+ parImpar);
    }
    public static boolean esPar(int a) {
        boolean par= false;
        int modulo = a%2;
        if(modulo==0){
            par=true;
        }
        return par;
    }

}
