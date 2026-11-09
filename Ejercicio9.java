import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = 25;
        int numero;
        int intentos = 0;

        do {
            System.out.print("Adivine el número: ");
            numero = sc.nextInt();

            intentos++;

            if (numero > secreto) {
                System.out.println("Muy alto");
            } else if (numero < secreto) {
                System.out.println("Muy bajo");
            }

        } while (numero != secreto);

        System.out.println("¡Correcto!");
        System.out.println("Intentos realizados: " + intentos);
    }
}