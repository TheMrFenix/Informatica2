package Proyecto_Informatica_2;
public class Seguridad extends Empleado{
    private String equipoAsalto_Seg;
    private int carnet_Seg;
    private String direccion_Seg;
    private int telefono_Seg;
    private String areaDespliegue_Seg;
    public Seguridad() {
    }
    public String getEquipoAsalto_Seg() {
        return equipoAsalto_Seg;
    }
    public void setEquipoAsalto_Seg(String equipoAsalto_Seg) {
        this.equipoAsalto_Seg = equipoAsalto_Seg;
    }
    public int getCarnet_Seg() {
        return carnet_Seg;
    }
    public void setCarnet_Seg(int carnet_Seg) {
        this.carnet_Seg = carnet_Seg;
    }
    public String getDireccion_Seg() {
        return direccion_Seg;
    }
    public void setDireccion_Seg(String direccion_Seg) {
        this.direccion_Seg = direccion_Seg;
    }
    public int getTelefono_Seg() {
        return telefono_Seg;
    }
    public void setTelefono_Seg(int telefono_Seg) {
        this.telefono_Seg = telefono_Seg;
    }
    public String getAreaDespliegue_Seg() {
        return areaDespliegue_Seg;
    }
    public void setAreaDespliegue_Seg(String areaDespliegue_Seg) {
        this.areaDespliegue_Seg = areaDespliegue_Seg;
    }
    @Override
    public String toString() {
        return "Seguridad{" +
                "Equipo de Asalto: '" + equipoAsalto_Seg + '\'' +
                ", Carnet de Identidad: " + carnet_Seg +
                ", Direccion: '" + direccion_Seg + '\'' +
                ", Telefono/Celular: " + telefono_Seg +
                ", Area de Despliegue: '" + areaDespliegue_Seg + '\'' +
                '}';
    }
}
