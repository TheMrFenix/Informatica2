package parcial2.examen2;
public class Cajero {
    private int id;
    private String nombre;
    private String email;
    private String carnetDeConducir;
    private String contraseña;
    public Cajero() {
    }
    public int getId() {
        return id;
    }
    public void setId(String Id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCarnetDeConducir() {
        return carnetDeConducir;
    }
    public void setCarnetDeConducir(String carnetDeConducir) {
        this.carnetDeConducir = carnetDeConducir;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public String toString() {
        return "Cajero{" +
                "id='" + id +
                "nombre=" + nombre +
                ", email=" + email +
                ", carnetDeConducir=" + carnetDeConducir +
                ", contraseña=" + contraseña +
                '}';
    }
}
