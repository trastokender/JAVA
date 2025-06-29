import java.util.Scanner;

public class PideTodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe algo: ");
        String entrada =sc.nextLine();

        if (entrada.isEmpty()) {
            System.out.println("No has escrito nada.");
        } else if (entrada.matches("-?\\d+")) {
            System.out.println("Has introducido un número entero.");

        } else if (entrada.length() ==1 && Character.isLetter(entrada.charAt(0))) {
            System.out.println("Has escrito una sola letra.");

        } else {
            System.out.println("Parece una frase un texto con varios caracteres");
        }

        sc.close();
    }
}
