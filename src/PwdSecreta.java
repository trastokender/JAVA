import java.util.Scanner;

public class PwdSecreta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final String pwdS = "JavaRocks";
        String palabra ="";
        int intentos=0;

        while (!palabra.equalsIgnoreCase(pwdS)&& (intentos<3)) {
            System.out.print("¿Contraseña?: ");
            palabra = teclado.nextLine();
            intentos++;
            System.out.println();
            if (!palabra.equalsIgnoreCase(pwdS)) {
                System.out.println("Intento "+ intentos + (" de 3"));
            }
        }
        if (palabra.equalsIgnoreCase(pwdS)){
            System.out.println("✅Acceso permitido");
        } else {
            System.out.println("⛔Acceso denegado");
        }

        teclado.close();
    }
}

