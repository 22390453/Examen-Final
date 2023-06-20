import java.util.Scanner;

public class Paquetes {
    Scanner scanner = new Scanner(System.in);
    private double entrada, comidbuf, espcnoc, naddel;

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public void setComidbuf(double comidbuf) {
        this.comidbuf = comidbuf;
    }

    public void setEspcnoc(double espcnoc) {
        this.espcnoc = espcnoc;
    }

    public void setNaddel(double naddel) {
        this.naddel = naddel;
    }

    // Métodos setters sobrecargados para establecer múltiples valores a la vez
    public void setPrecios(double entrada) {
        this.entrada = entrada;
    }

    public void setPrecios(double entrada, double comidbuf) {
        this.entrada = entrada;
        this.comidbuf = comidbuf;
    }

    public void setPrecios(double entrada, double comidbuf, double espcnoc) {
        this.entrada = entrada;
        this.comidbuf = comidbuf;
        this.espcnoc = espcnoc;
    }

    public void setPrecios(double entrada, double comidbuf, double espcnoc, double naddel) {
        this.entrada = entrada;
        this.comidbuf = comidbuf;
        this.espcnoc = espcnoc;
        this.naddel = naddel;
    }

    // Método para realizar acciones dependiendo del paquete
    public void realizarAcciones() {
        if (entrada != 0 && comidbuf == 0 && espcnoc == 0 && naddel == 0) {
            // Acciones específicas para el paquete de entrada solamente
            System.out.println("Realizando acciones para el paquete de entrada solamente");
        } else if (entrada != 0 && comidbuf != 0 && espcnoc == 0 && naddel == 0) {
            // Acciones específicas para el paquete de entrada y comida/buffet
            System.out.println("Realizando acciones para el paquete de entrada y comida/buffet");
            realizarAccionComida();
        } else if (entrada != 0 && comidbuf != 0 && espcnoc != 0 && naddel == 0) {
            // Acciones específicas para el paquete de entrada, comida/buffet y espectáculo
            // nocturno
            System.out.println(
                    "Realizando acciones para el paquete de entrada, comida/buffet y espectáculo nocturno");
            realizarAccionComida();
            realizarAccionEspectaculo();
        } else if (entrada != 0 && comidbuf != 0 && espcnoc != 0 && naddel != 0) {
            // Acciones específicas para el paquete completo con nado con delfines
            System.out.println("Realizando acciones para el paquete completo con nado con delfines");
            realizarAccionComida();
            realizarAccionEspectaculo();
            realizarAccionNadoDelfines();
        } else {
            System.out.println("Paquete inválido");
        }
    }

    // Método para realizar la acción específica de comida/buffet
    private void realizarAccionComida() {
        System.out.println("Seleccione el tipo de comida:");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        int opcionComida = scanner.nextInt();

        switch (opcionComida) {
            case 1:
                System.out.println("Acciones para la opción 1 de comida");
              //  espcnoc += 10;
                break;
            case 2:
                System.out.println("Acciones para la opción 2 de comida");
              //  espcnoc += 10;
                break;
            default:
                System.out.println("Opción de comida inválida");
                break;
        }
    }

    // Método para realizar la acción específica de espectáculo nocturno
    private void realizarAccionEspectaculo() {
        System.out.println("Seleccione el tipo de espectáculo:");
        System.out.println("1. Balcón");
        System.out.println("2. VIP");
        System.out.println("3. General");
        int opcionEspectaculo = scanner.nextInt();

        switch (opcionEspectaculo) {
            case 1:
                System.out.println("Acciones para el espectáculo en balcón");
                break;
            case 2:
                System.out.println("Acciones para el espectáculo en VIP");
              //  espcnoc+= 20;
                break;
            case 3:
                System.out.println("Acciones para el espectáculo en general");
              //  espcnoc += 10;
                break;
            default:
                System.out.println("Opción de espectáculo inválida");
                break;
        }
    }

    // Método para realizar la acción específica de nado con delfines
    private void realizarAccionNadoDelfines() {
        System.out.println("Seleccione el tipo de nado con delfines:");
        System.out.println("1. Sencillo");
        System.out.println("2. Extra");
        int opcionNadoDelfines = scanner.nextInt();

        switch (opcionNadoDelfines) {
            case 1:
                System.out.println("Acciones para el nado con delfines sencillo");
                break;
            case 2:
                System.out.println("Acciones para el nado con delfines extra");
             //   naddel += 20;
                break;
            default:
                System.out.println("Opción de nado con delfines inválida");
        
                break;
        }
    }

    public double calcularTotalAPagar() {
        double totalAPagar = entrada + comidbuf + espcnoc + naddel;
        return totalAPagar;
    }

    public void resumirCompra() {
        System.out.println("Resumen de la compra:");

        if (entrada != 0) {
            System.out.println("- Entrada: $" + entrada);
        }

        if (comidbuf != 0) {
            System.out.println("- Comida/Buffet: $" + comidbuf);
        }

        if (espcnoc != 0) {
            System.out.println("- Espectáculo Nocturno: $" + espcnoc);
        }

        if (naddel != 0) {
            System.out.println("- Nado con Delfines: $" + naddel);
        }

        double totalAPagar = calcularTotalAPagar();
        System.out.println("Total a pagar: $" + totalAPagar);
    }

}
