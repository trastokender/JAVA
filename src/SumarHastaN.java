import java.util.Scanner;

public class SumarHastaN {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print ("¿Hasta qué número quieres sumar? ");
        int limite =teclado.nextInt();
        teclado.nextLine();
        int num=1;
        int suma=0;

        while (num<=limite) {
            System.out.print(num);
            suma=suma+num;
            if (num<limite) {
                System.out.print(" + ");
            } else{
                System.out.print(" = " + suma);
            }
            num++;
        }

        System.out.println(" ");
        System.out.println("\nLa suma del 1 al "+ limite +" es: "+suma);
        teclado.close();
    }
}