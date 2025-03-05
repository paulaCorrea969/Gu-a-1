public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private String fechaExpiracion;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;

    public Producto(int codigo, String nombre, String tipo, String fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }
