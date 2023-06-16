package Parcial3;
public class Logistica extends Empleado{
    private String areaTrabajo_Lgs;
    private int carnet_Lgs;
    private String direccion_Lgs;
    private int telefono_Lgs;
    private String correoElectronico_Lgs;
    public Logistica() {
    }
    public String getAreaTrabajo_Lgs() {
        return areaTrabajo_Lgs;
    }
    public void setAreaTrabajo_Lgs(String areaTrabajo_Lgs) {
        this.areaTrabajo_Lgs = areaTrabajo_Lgs;
    }
    public int getCarnet_Lgs() {
        return carnet_Lgs;
    }
    public void setCarnet_Lgs(int carnet_Lgs) {
        this.carnet_Lgs = carnet_Lgs;
    }
    public String getDireccion_Lgs() {
        return direccion_Lgs;
    }
    public void setDireccion_Lgs(String direccion_Lgs) {
        this.direccion_Lgs = direccion_Lgs;
    }
    public int getTelefono_Lgs() {
        return telefono_Lgs;
    }
    public void setTelefono_Lgs(int telefono_Lgs) {
        this.telefono_Lgs = telefono_Lgs;
    }
    public String getCorreoElectronico_Lgs() {
        return correoElectronico_Lgs;
    }
    public void setCorreoElectronico_Lgs(String correoElectronico_Lgs) {
        this.correoElectronico_Lgs = correoElectronico_Lgs;
    }
    @Override
    public String toString() {
        return "Logistica{" +
                "Area Trabajo: '" + areaTrabajo_Lgs + '\'' +
                ", Carnet: " + carnet_Lgs +
                ", Direccion: '" + direccion_Lgs + '\'' +
                ", Telefono: " + telefono_Lgs +
                ", CorreoElectronico: '" + correoElectronico_Lgs + '\'' +
                '}';
    }
}
