import java.util.Scanner;

public class AreaConMetodo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Base?: ");
        double base = teclado.nextDouble();
        System.out.print("Altura?: ");
        double altura = teclado.nextDouble();
        double area = calcularAreaTriangulo(base, altura);
        System.out.println("El área es: " + area);
        teclado.close();
    }

    public static double calcularAreaTriangulo (double base, double altura) {
        double resultado= (base * altura)/2;
        return resultado;
    }

}
