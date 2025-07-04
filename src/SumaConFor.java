public class SumaConFor {
    public static void main(String[] args) {
        int suma=0;

        for (int i=1;i<=10;i++) {
            System.out.print(i);
            suma= suma+i;
            if (i<10) {
                System.out.print(" + ");
            } else {
                System.out.print (" = ");
            }
            }
        System.out.print(suma);
        }

    }

