import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, exponente;
        long resultado = 1;
        int contador = 1;

        System.out.print("Base: ");
        base = sc.nextInt();

        System.out.print("Exponente: ");
        exponente = sc.nextInt();

        do {
            resultado *= base;
            contador++;
        } while (contador <= exponente);

        System.out.println("Resultado: " + resultado);
    }
}
