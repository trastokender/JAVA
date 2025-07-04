public class cuantasveces {
    public static void main(String[] args) {
        int x = 10;

        do {
            System.out.println("Hola " + x);
            x--;
        } while (x > 7);

        int  y = 10;

        while (y > 7) {
            System.out.println("Hola " + y);
            y--;
        }
        System.out.println();

        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 3);
    }
}
