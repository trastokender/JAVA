public class Suma10 {
    public static void main(String[] args) {
        int num=1;
        int suma=0;
        while(num<=10) {
          suma=suma+num;
          System.out.print(" + "+ num+ " ");
          ++num;
        }

        System.out.println(" = " + suma);
    }

}
