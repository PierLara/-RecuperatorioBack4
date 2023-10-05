public class Yate extends Embarcacion implements Validacion {
    private final int cantidadCamarotes;

    public Yate(double precioBase, double valorAdicional, int anoFabricacion, double eslora, Capitan capitan, int cantidadCamarotes) {
        super(precioBase, valorAdicional, anoFabricacion, eslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
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
        if (cantidadCamarotes > 7) {
            System.out.println("Yate de lujo");
        } else {
            System.out.println("Yate estándar");
        }
    }
}