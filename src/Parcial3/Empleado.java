package Parcial3;
public class Empleado {
    private String nombre_Emp;
    private int id_Emp;
    private int claveAcceso_Emp;
    private int sueldo_Emp;
    public Empleado() {
    }
    public String getNombre_Emp() {
        return nombre_Emp;
    }
    public void setNombre_Emp(String nombre_Emp) {
        this.nombre_Emp = nombre_Emp;
    }
    public int getId_Emp() {
        return id_Emp;
    }
    public void setId_Emp(int id_Emp) {
        this.id_Emp = id_Emp;
    }
    public int getClaveAcceso_Emp() {
        return claveAcceso_Emp;
    }
    public void setClaveAcceso_Emp(int claveAcceso_Emp) {
        this.claveAcceso_Emp = claveAcceso_Emp;
    }
    public int getSueldo_Emp() {
        return sueldo_Emp;
    }
    public void setSueldo_Emp(int sueldo_Emp) {
        this.sueldo_Emp = sueldo_Emp;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre: '" + nombre_Emp + '\'' +
                ", ID: " + id_Emp +
                ", Clave de Acceso: " + claveAcceso_Emp +
                ", Sueldo: " + sueldo_Emp +
                '}';
    }
}