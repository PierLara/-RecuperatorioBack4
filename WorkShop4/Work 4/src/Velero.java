public class Velero extends Embarcacion implements Validacion {
    private final int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional, int anoFabricacion, double eslora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdicional, anoFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }
    @Override
    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (anoFabricacion > 2020) {
            monto += valorAdicional;
        }
        return monto;
    }
    @Override
    public void validar() {
        if (cantidadMastiles > 4) {
            System.out.println ("Velero grande");
        } else {
            System.out.println("Velero estándar");
        }
    }
}