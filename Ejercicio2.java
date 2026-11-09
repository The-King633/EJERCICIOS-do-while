import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Ingrese contraseña: ");
            password = sc.nextLine();

            if (!password.equals("Java2026")) {
                System.out.println("Contraseña incorrecta");
            }

        } while (!password.equals("Java2026"));

        System.out.println("Acceso permitido");
    }
}