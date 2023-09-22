public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Cuenta miCuenta = new Cuenta("Camilo Arias", 2750.0);
        miCuenta.getDatosCuenta();
        miCuenta.setIngreso(500.0);
        miCuenta.setRetiro(200.0);
        miCuenta.getDatosCuenta();
        miCuenta.getSaldoCuenta ();
    }
}