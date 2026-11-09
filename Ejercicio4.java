import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        int cantidad = 0;
        char continuar;

        do {
            System.out.print("Nota: ");
            nota = sc.nextDouble();

            suma += nota;
            cantidad++;

            System.out.print("¿Continuar? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Cantidad de notas: " + cantidad);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + (suma / cantidad));
    }
}