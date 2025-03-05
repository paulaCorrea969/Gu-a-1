public class Estudiante extends Persona {
    private String colegioGraduacion;
    private String fechaIngreso;

    public Estudiante(String cedula, String nombre, String fechaNacimiento, String lugarNacimiento, String colegioGraduacion, String fechaIngreso) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.colegioGraduacion = colegioGraduacion;
        this.fechaIngreso = fechaIngreso;
    }
