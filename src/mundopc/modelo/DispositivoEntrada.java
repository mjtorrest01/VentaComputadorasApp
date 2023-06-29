package mundopc.modelo;

public class DispositivoEntrada {

    private  String tipoDeEntrada;
    private String marca;

    public DispositivoEntrada(String tipoDeEntrada, String marca) {
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
