public class operaciones {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;

        System.out.println("suma: "+ (a+b));
        System.out.println("resta: "+ (a-b));
        System.out.println("multiplicación: "+ (a*b));
        System.out.println("división: "+ (a/b));
        System.out.println("resto: "+ (a%b));

        double resultado = 10.0 / 3.0;
        System.out.println(String.format("%.2f", resultado)); //  formateamos los decimales a solo 2. Resultado: 3.33



    }
}
