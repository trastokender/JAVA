public class asignar {
    public static void main(String[] args) {
        double precio=55.23;
        precio +=10; //aumenta el precio en 10
        System.out.println("Precio actualizado: " + precio);

        precio *=1.2; //aumenta el precio un 20%
        System.out.println("Precio con incremento del 20%: " + precio);
        System.out.println("Precio con incremento del 20% formateado: " + String.format("%.2f", precio));

    }
}
