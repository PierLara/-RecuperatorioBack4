public abstract class Embarcacion {
    protected double precioBase;
    protected double valorAdicional;
    protected int anoFabricacion;
    protected double eslora;
    protected Capitan capitan;
    public Embarcacion(double precioBase, double valorAdicional, int anoFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }
    public abstract double calcularMontoAlquiler();
}