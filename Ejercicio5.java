import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 5000;
        int opcion;

        do {
            System.out.println("\n=== CAJERO AUTOMÁTICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: S/" + saldo);
                    break;

                case 2:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro realizado.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();

                    saldo += deposito;
                    System.out.println("Depósito realizado.");
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}