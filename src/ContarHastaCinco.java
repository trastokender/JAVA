public class ContarHastaCinco {
    public static void main(String[] args) {
        int num= 1;
        System.out.println("Creciente");
        System.out.println("==========");
        System.out.println("");
        while (num <=5) {
            System.out.println("Número " + num);
            num++;

        }
        System.out.println("");
        num--;
        System.out.println("Decreciente");
        System.out.println("===========");
        System.out.println("");

        while (num>=1) {
            System.out.println("Número " + num);
            num--;
        }
    }
}
