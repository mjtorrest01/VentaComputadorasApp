package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrden;

    public Orden(){
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }

    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }

    public void mostarOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total Computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }
}
