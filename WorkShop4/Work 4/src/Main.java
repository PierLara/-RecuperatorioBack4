public class Main {
    public static void main(String[] args) {
        Capitan capitanYate = new Capitan("Pier", "Lara", "94255");
        Yate yate = new Yate(50000, 20000, 2021, 15.5, capitanYate, 9);
        Capitan capitanVelero = new Capitan("Santiago", "Vargas", "64381");
        Velero velero = new Velero(30000, 20000, 2020, 12.0, capitanVelero, 6);
        System.out.println(yate);
        yate.validar();
        System.out.println("Monto de alquiler del yate: $" + yate.calcularMontoAlquiler());
        System.out.println();
        System.out.println(velero);
        velero.validar();
        System.out.println("Monto de alquiler del velero: $" + velero.calcularMontoAlquiler());
    }
}