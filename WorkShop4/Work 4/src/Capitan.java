public class Capitan {
    private final String nombre;
    private final String apellido;
    private final String matriculaNavegacion;
    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }
    @Override
    public String toString() {
        return "Capitan: " + nombre + " " + apellido + ", Matrícula de Navegación: " + matriculaNavegacion;
    }
}
