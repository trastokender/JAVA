import java.util.Scanner;

public class InfoUsuario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("😊 Dime tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Dime tu edad: ");
        int edad = teclado.nextInt();

        teclado.nextLine(); //Limpiamos el búfer

        System.out.print("¿en qué ciudad vives?: ");
        String ciudad = teclado.nextLine();

        System.out.print("¿Cuál es tu color favorito?: ");
        String color = teclado.nextLine();

        System.out.print("¿Te gusta programar? (true/false) ");
        boolean programar = teclado.nextBoolean();

        System.out.println("\n📋 TU FICHA DE USUARIO");
        System.out.println("------------------------------");

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. Vives en " + ciudad + ". Tu color favorito es el " +color+ ".");

        System.out.println(); //Hacemos salto de linea por estética

        //Edad
        if(edad>=18) {
            System.out.println("Y eres mayor de edad.");
        } else {
            System.out.println("👦 Eres menor de edad.");
        }

        //Gusto por programar
        if (programar) {
            System.out.println("👍 Y te gusta programar.");
        } else {
            System.out.println("Y no te gusta programar.");
        }

        //Comunidad autónoma según ciudad (dejo la versión en IF por saber que existe esa opción)

        /* if (ciudad.equalsIgnoreCase("Valencia")
                || (ciudad.equalsIgnoreCase("Castellón"))
                || (ciudad.equalsIgnoreCase("Castellon"))
                || (ciudad.equalsIgnoreCase("Alicante"))){
                    System.out.println("Eres de la Comunidad valenciana.");
        } else if (ciudad.equalsIgnoreCase("Zaragoza")
                || (ciudad.equalsIgnoreCase("Huesca"))
                || (ciudad.equalsIgnoreCase("Teruel"))) {
            System.out.println("Eres de Aragón. ");
      } else {
            System.out.println("No sé de donde eres ");
      }
       */

        //Comunidad autónoma según ciudad
        switch (ciudad.toLowerCase()) {
            case ("valencia"):
            case ("castellón"):
            case ("castellon"):
            case ("alicante"):
                 System.out.println("Eres de la Comunidad valenciana.");
                 break;
            case ("zaragoza"):
            case ("huesca"):
            case ("teruel"):
                System.out.println("Eres de Aragón.");
                break;
         default:
               System.out.println("Eres de alguna comunidad autónoma que no conozco.");
     }

     //Color favorito
        System.out.println("\n🎨 Análisis de tu color favorito:");

        switch (color.toLowerCase()) {
            case "rojo":
                System.out.println("🔴 Rojo: color de la energía y la pasión.");
                break;
            case "azul":
                System.out.println("🔵 Azul: calma y serenidad.");
                break;
            case "verde":
                System.out.println("🟢 Verde: naturaleza y equilibrio.");
                break;
            default:
                System.out.println("🎨 No tengo un análisis profundo para ese color, ¡pero seguro que es bonito!");
        }

        teclado.close();
    }
}
