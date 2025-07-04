import java.util.Scanner;

public class SumaPrimerosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un nº: ");
        int entrada = teclado.nextInt();
        int i=1;
        int suma=0;
        while (i<=entrada){
            suma +=i;
            if (i<entrada){
                System.out.print(i+ " + ");
            } else {
                System.out.println(i + " = " +suma);
            }

            i+=1;

        }
        System.out.println ("La suma de los primeros " + entrada + " números es " +suma);

        teclado.close();
    }

}
