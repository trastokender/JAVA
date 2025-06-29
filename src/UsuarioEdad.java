import java.util.Scanner;

public class UsuarioEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        if (edad>=18) {
            System.out.println("Acceso permitido");
        }
        else {
            System.out.println("Acceso denegado");
        }
        teclado.close();
        }
    }
