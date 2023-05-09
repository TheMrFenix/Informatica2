package parcial2.examen2;
public class Usuario extends Pedido{
    private String nombre;
    private int ci;
    private int telefono;
    private String direccion;
    public Usuario() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + getId() + '\'' +
                "nombre=" + nombre +
                ", ci=" + ci +
                ", telefono=" + telefono +
                ", direccion=" + direccion +
                '}';
    }
}