public class NotasArray {
    public static void main(String[] args) {
        int[] notas = {4,7,8,3,6}; //Creamos array con 5 notas

        System.out.println("Todas las notas: ");
        for (int i=0; i< notas.length; i++) {
            System.out.println("nota " + (i + 1) + ": " + notas[i]); // mostramos todas las notas
        }
            System.out.println("\n Notas aprobadas: ");
            for (int nota :notas) {
                if (nota > 5) {
                    System.out.println(" ✅ " + nota);
                }
            }

    }

}
