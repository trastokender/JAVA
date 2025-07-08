public class Main3 {
     public static void main(String[] args) {
          Persona p = new Persona();
          p.nombre= "Emilio";
          p.edad = 57;

          System.out.println(p.saludar());
          System.out.println("¿Mayor de edad? " +p.esMayorEdad());
        }
    }

class Persona {
     String nombre;
     int edad;

     public String saludar() {
        return "Hola, soy "+nombre;
        }

     public boolean esMayorEdad() {
        return edad>=18;

        }

    }

