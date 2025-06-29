import java.util.Scanner;

public class DiasFestivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un día de la semana: ");
        String dia = teclado.nextLine();
        System.out.println("Has escrito " + dia);

        String diaMin = dia.toLowerCase();
        System.out.println("En minúscula sería : " +diaMin);



       teclado.close();
    }
}
