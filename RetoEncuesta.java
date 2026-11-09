import java.util.Scanner;

public class RetoEncuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int personas = 0;
        int sumaEdades = 0;
        int mayorEdad = 0;
        int menorEdad = 999;
        int mayoresDeEdad = 0;
        char continuar;

        do {
            System.out.print("Ingrese edad: ");
            edad = sc.nextInt();

            sumaEdades += edad;
            personas++;

            if (edad > mayorEdad) {
                mayorEdad = edad;
            }

            if (edad < menorEdad) {
                menorEdad = edad;
            }

            if (edad >= 18) {
                mayoresDeEdad++;
            }

            System.out.print("¿Continuar? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        double promedio = (double) sumaEdades / personas;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Cantidad de personas: " + personas);
        System.out.println("Promedio de edad: " + promedio);
        System.out.println("Edad mayor: " + mayorEdad);
        System.out.println("Edad menor: " + menorEdad);
        System.out.println("Mayores de edad: " + mayoresDeEdad);
    }
}