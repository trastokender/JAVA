public class declara2 {
    public static void main(String[] args) {
        int edad;
        double altura;
        String nombre;

        edad = 57;
        altura = 1.70;
        nombre = "Emilio";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");
        System.out.println();
        System.out.println("Nombre: "+ nombre + ", Edad: " + edad + " años, Altura: " + altura + " m");
        //Modificamos valores de las variables

        edad = 60;
        altura = 1.72;
        nombre = "Juan";

        System.out.println();
        System.out.println("Valores modificados. ");
        System.out.println("Nombre: "+ nombre + ", Edad: " + edad + " años, Altura: " + altura + " m");

    }
}
