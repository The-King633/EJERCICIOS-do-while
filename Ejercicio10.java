import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double precio;
        int cantidad;
        double totalVentas = 0;
        int totalProductos = 0;
        char continuar;

        do {
            System.out.print("Nombre del producto: ");
            nombre = sc.next();

            System.out.print("Precio: ");
            precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            cantidad = sc.nextInt();

            totalVentas += precio * cantidad;
            totalProductos += cantidad;

            System.out.print("¿Desea registrar otra venta? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Monto total vendido: S/" + totalVentas);
        System.out.println("Cantidad total de productos vendidos: " + totalProductos);
        System.out.println("Promedio por producto: S/" + (totalVentas / totalProductos));
    }
}