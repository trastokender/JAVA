public class SumarDelUnoAlDiez {
    public static void main(String[] args) {
        int num=1;
        int suma=0;

        while (num<=10) {
            System.out.print(num);
            suma=suma+num;
            if (num<10) {
                System.out.print(" + ");
            }
            num++;
        }
        System.out.print(" = " + suma);
        System.out.println(" ");
        System.out.println("La suma del 1 al 10 es: "+suma);
    }
}
