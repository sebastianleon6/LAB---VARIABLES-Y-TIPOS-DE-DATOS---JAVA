import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double impuesto = 0.21;


        System.out.println("Dame el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.println("Dame el precio del producto: ");
        int precio = scanner.nextInt();

        System.out.println("Dame la cantidad que vas a llevar: ");
        int cantidad = scanner.nextInt();

        System.out.println("Cuanto dinero craes: ");
        int dinero = scanner.nextInt();

        int subtotal = precio * cantidad;

        double totalApagar = subtotal * impuesto;

        double totalApagar2 = subtotal + totalApagar;

        int  totalAPagar3 = (int) totalApagar2;

        // Validación



        boolean puedePagarTodo = true;

        boolean puedeComprar = (dinero == totalApagar) && puedePagarTodo;

        // Salida Recibo



        System.out.println("--- REBIVO ---");
        System.out.println("Producto: "+ producto);
        System.out.println("Precio: "+ precio);
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("Total a pagar: "+ totalAPagar3);
        System.out.println("Cuánto dinero traes: "+ dinero);
        System.out.println("¿Compra aprobada?: "+ puedeComprar);



    }
}
