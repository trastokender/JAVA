public class declara3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        System.out.println("\n=== Resultados de comparación ===\n");
        System.out.println("¿A es mayor que B? " + (a>b)); //False
        System.out.println("B es igual a A? " + (b==a)); //false
        System.out.println("¿A es diferente de B? " +(a!=b)); //true
        System.out.println("A es mayor o igual que B? " + (a>=b)); //false
        System.out.println("A es menor o igual que B? " + (a<=b)); //true

        System.out.println("\n=== Resultados con operadores lógicos ===\n");
        System.out.println("¿A es menor que B y distinta de B? " + ((a<b)&&(a!=b))); //true
        System.out.println("¿A es mayor que B o menor que 4? " + ((a>b)||(b<4))); //false
        System.out.println("¿A NO es mayor que 70? " + (!(a>70))); //true
    }
}
