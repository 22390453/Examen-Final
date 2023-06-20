import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de los servicios
        double precioEntrada = 100.0;
        double precioComidaBufet = 50.0;
        double precioEspacioNocturno = 80.0;
        double precioAdicional = 30.0;

        // Crear objeto de la clase Paquetes
        Paquetes paquete = new Paquetes();

        // Mostrar opciones al usuario
        System.out.println("¡Bienvenido! Elige un paquete:");
        System.out.println("1. Entrada sola");
        System.out.println("2. Entrada + Comida bufet");
        System.out.println("3. Entrada + Comida bufet + Espacio nocturno");
        System.out.println("4. Entrada + Comida bufet + Espacio nocturno + Adicional");

        // Leer opción del usuario
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido el paquete 1: Entrada sola");
                paquete.setEntrada(precioEntrada);
                paquete.realizarAcciones();
                System.out.println(paquete.calcularTotalAPagar());
                break;
            case 2:
                System.out.println("Has elegido el paquete 2: Entrada + Comida bufet");
                paquete.setEntrada(precioEntrada);
                paquete.setComidbuf(precioComidaBufet);
                paquete.realizarAcciones();
                System.out.println(paquete.calcularTotalAPagar());
                break;
            case 3:
                System.out.println("Has elegido el paquete 3: Entrada + Comida bufet + Espacio nocturno");
                paquete.setEntrada(precioEntrada);
                paquete.setComidbuf(precioComidaBufet);
                paquete.setEspcnoc(precioEspacioNocturno);
                paquete.realizarAcciones();
                System.out.println(paquete.calcularTotalAPagar());
                break;
            case 4:
                System.out.println("Has elegido el paquete 4: Entrada + Comida bufet + Espacio nocturno + Adicional");
                paquete.setEntrada(precioEntrada);
                paquete.setComidbuf(precioComidaBufet);
                paquete.setEspcnoc(precioEspacioNocturno);
                paquete.setNaddel(precioAdicional);
                paquete.realizarAcciones();
                System.out.println(paquete.calcularTotalAPagar());
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        paquete.resumirCompra();
        scanner.close();
    }
}
