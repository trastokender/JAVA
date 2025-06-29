import java.util.Scanner;

public class entero_decimal {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out. print("Dame un número entero: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("El numero  es: " + num);
        } else {
            System.out.println("Eso no es un número entero.");
        }


        sc.close();
    }
}
