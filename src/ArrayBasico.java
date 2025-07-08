public class ArrayBasico {
    public static void main(String[] args) {
        int[] numeros = new int[3]; // Creamos un array de tres enteros;

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        for(int i=0; i<numeros.length; i++){
            System.out.println("valor en la posición " + (i + 1) + ": " + numeros[i]);
        }
    }
}
