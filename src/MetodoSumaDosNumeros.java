public class MetodoSumaDosNumeros {
    public static void main(String[] args){
        sumar(7,5);
        sumar (10,15);
    }

    public static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println(a+ " + "+b + " = " + resultado);
    }
}
