public class Preciso {
    public static void main(String[] args) {
        double precio = 100.75;

        precio += 15.25;
        precio *= 1.10;
        precio /= 2;
        precio %= 6;

        System.out.println("Precio final: " + String.format("%.2f", precio));

    }
}
