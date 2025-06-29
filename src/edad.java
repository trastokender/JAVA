import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        } else if (edad>=13) {
            System.out.println("Eres adolescente");
        } else if (edad>=0) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("¿Edad negativa? ¿Eres un viajero del tiempo?");
        }
        sc.close();
    }
}
