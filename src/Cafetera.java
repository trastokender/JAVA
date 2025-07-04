public class Cafetera {
    public static void main(String[] args) {
    prepararCafe("Espresso");
    prepararCafe("Capuccino");
    prepararTe("Matcha");
    prepararTe("Verde");
    int total = sumar (4,6);
    System.out.println("➕La suma es: " + total);

    }

    public static void prepararCafe(String tipo) {
        System.out.println ("☕ Preparando café: " + tipo);
    }
    public static void prepararTe(String tipo) {
        System.out.println ("☕ Preparando Té: " + tipo);
    }
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

}

