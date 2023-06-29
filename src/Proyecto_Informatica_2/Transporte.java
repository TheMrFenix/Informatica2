package Proyecto_Informatica_2;
public class Transporte extends Empleado{
    private String areaTrabajo_Tpt;
    private int carnetConducir_Tpt;
    private String direccion_Tpt;
    private int telefono_Tpt;
    public Transporte() {
    }
    public String getAreaTrabajo_Tpt() {
        return areaTrabajo_Tpt;
    }
    public void setAreaTrabajo_Tpt(String areaTrabajo_Tpt) {
        this.areaTrabajo_Tpt = areaTrabajo_Tpt;
    }
    public int getCarnetConducir_Tpt() {
        return carnetConducir_Tpt;
    }
    public void setCarnetConducir_Tpt(int carnetConducir_Tpt) {
        this.carnetConducir_Tpt = carnetConducir_Tpt;
    }
    public String getDireccion_Tpt() {
        return direccion_Tpt;
    }
    public void setDireccion_Tpt(String direccion_Tpt) {
        this.direccion_Tpt = direccion_Tpt;
    }
    public int getTelefono_Tpt() {
        return telefono_Tpt;
    }
    public void setTelefono_Tpt(int telefono_Tpt) {
        this.telefono_Tpt = telefono_Tpt;
    }
    @Override
    public String toString() {
        return "Transporte{" +
                "Area de Trabajo: '" + areaTrabajo_Tpt + '\'' +
                ", Carnet de Conducir: " + carnetConducir_Tpt + '\'' +
                ", Direccion: '" + direccion_Tpt + '\'' +
                ", Telefono/Celular: " + telefono_Tpt +
                '}';
    }
}
