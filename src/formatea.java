public class formatea {
    public static void main(String[] args) {
        double num1 =10.5;
        double num2 = 3.2;

        System.out.println();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;

        System.out.println();

        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Producto: "+ producto);
        System.out.println("División: "+ division);
        System.out.println("Módulo (resto): "+ modulo);

        System.out.println();

        System.out.println("División: "+ String.format("%.2f", division));
        System.out.println("Módulo (resto): "+ String.format("%.2f", modulo));
    }
}
