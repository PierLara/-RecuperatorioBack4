import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private final String nombreDelTitular;
    private final long numeroDeCuenta;

    // Constructor de la clase
    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroDeCuentaAleatorio();
    }

    // Setter para hacer un ingreso
    public void setIngreso(double cantidad) {
        if (cantidad > 0) {
            saldoDeCuenta += cantidad;
            System.out.println("Se ha realizado un ingreso de $" + cantidad);
        } else {
            System.out.println("El monto del ingreso debe ser mayor que 0");
        }
    }

    // Setter para hacer un retiro
    public void setRetiro(double cantidad) {
        if (cantidad > 0 && saldoDeCuenta >= cantidad) {
            saldoDeCuenta -= cantidad;
            System.out.println("Se ha realizado un retiro de $" + cantidad);
        } else {
            System.out.println("El monto del retiro es inválido o excede el saldo disponible.");
        }
    }

    // Getter para obtener el saldo de la cuenta
    public void getSaldoCuenta() {
    }

    // Getter para obtener los datos generales de la cuenta
    public void getDatosCuenta() {
        System.out.println("Nombre del titular: " + nombreDelTitular);
        System.out.println("Número de cuenta: " + numeroDeCuenta);
        System.out.println("Saldo de cuenta: $" + saldoDeCuenta);
    }

    // Genera un número de cuenta aleatorio
    private long generarNumeroDeCuentaAleatorio() {
        Random random = new Random();
        return Math.abs(random.nextLong());
    }
}