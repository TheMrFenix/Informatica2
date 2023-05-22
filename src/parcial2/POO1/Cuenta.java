package parcial2.POO1;
public class Cuenta {
    private String nombre="carlos";
    private String apellido;
    private int numeroCuenda;
    private double cantidad;
    public Cuenta() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getNumeroCuenda() {
        return numeroCuenda;
    }
    public void setNumeroCuenda(int numeroCuenda) {
        this.numeroCuenda = numeroCuenda;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellido + '\'' +
                ", numeroCuenda=" + numeroCuenda +
                ", cantidad=" + cantidad +
                '}';
    }
}
