package parcial2.POO2;
public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dia;
    private String mes;
    private String año;
    public Persona(String nombre, String primerApellido, String segundoApellido, String dia, String mes, String año) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getAño() {
        return año;
    }
    public void setAño(String año) {
        this.año = año;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Primer Apellido='" + primerApellido + '\'' +
                ", Segundo Apellido='" + segundoApellido + '\'' +
                ", Dia='" + dia + '\'' +
                ", Mes='" + mes + '\'' +
                ", Año='" + año + '\'' +
                '}';
    }
}
