import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

        } while (numero != 0);

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}