package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        // AGREGAR COMPONENTES DE LA COMPUTADORA MARCA LENOVO
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        Teclado tecladoLenovo = new Teclado("Bluethooth", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        // AGREGANDO COMPUTADORA COMPLETA MARCA LENOVO
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);

        // AGREGAR COMPONENTES DE LA COMPUTADORA MARCA DELL
        Raton ratondell = new Raton("usb", "dell");
        Teclado tecladodell = new Teclado("Usb", "dell");
        Monitor monitordell = new Monitor("dell", 15);
        // AGREGANDO COMPUTADORA COMPLETA MARCA DELL
        Computadora computadoraDell = new Computadora("dell", monitordell, tecladodell, ratondell);

        // ORDEN DE COMPUTADORA 1 UNA COMPUTADORA
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.mostarOrden();

        // ORDEN DE COMPUTADORA 2 DOS COMPUTADORAS
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.mostarOrden();

    }
}