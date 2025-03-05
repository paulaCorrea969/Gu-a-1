public class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private double sueldo;

    public Profesor(String cedula, String nombre, String fechaNacimiento, String lugarNacimiento, String profesion, String nacionalidad, double sueldo) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
    }
