public class MensajeBienvenida {

    public static void main(String[] args) {
        saludo();

        String saludar = "de nuevo";
        System.out.println(saludo(saludar)); /*Llama al método saludo y le envía como argumento la variable saludar
                                             que tiene como contenido "de nuevo"*/
        saludo("\nEstamos un día más con Java");

        String nombre = "Pedro";
        int edad = 34;
        int cafes= 12;

        System.out.println(saludo(nombre, edad));
        System.out.println(saludo(nombre, edad, cafes));

    }
    public static void saludo() {  //no devuelve nada, solo improme por pantalla
        System.out.println("\n Bienvenidos a todos");
    }

    public static String saludo(String a) { //devuelve saludo, que lo ha recogido antes como parámetro
        return "\nHola, "+a;
    }

    public static String saludo(String nombre, int edad) {
        return "\nHola, "+ nombre + ". Tienes "+edad+ " años.";
    }
    public static String saludo(String nombre, int edad, int cafes) {
        String cafeina;
        switch (cafes) {
            case 1:
            case 2:
            case 3:
                cafeina = "normal";
                break;
            case 4:
            case 5:
            case 6:
                cafeina = "alto";
                break;
            default:
                cafeina = "altísimo";

        }
        return "\n Hola "+ nombre+ ", tienes "+edad+ " años, y tu nivel de cafeina es "+cafeina;
    }
}
