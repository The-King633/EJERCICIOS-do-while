import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Celsius: ");
                    double c = sc.nextDouble();

                    double f = (c * 9 / 5) + 32;
                    System.out.println("Fahrenheit: " + f);
                    break;

                case 2:
                    System.out.print("Ingrese Fahrenheit: ");
                    double far = sc.nextDouble();

                    double cel = (far - 32) * 5 / 9;
                    System.out.println("Celsius: " + cel);
                    break;

                case 3:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }
}