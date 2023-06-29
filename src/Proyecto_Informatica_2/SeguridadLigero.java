package Proyecto_Informatica_2;
public class SeguridadLigero extends NiveldeRiesgo{
    private String vehiculos_Seg;
    private String equiposAsalto_Seg;
    private String personal_Seg;
    public SeguridadLigero() {
    }
    public String getVehiculos_Seg() {
        return vehiculos_Seg;
    }
    public void setVehiculos_Seg(String vehiculos_Seg) {
        this.vehiculos_Seg = vehiculos_Seg;
    }
    public String getEquiposAsalto_Seg() {
        return equiposAsalto_Seg;
    }
    public void setEquiposAsalto_Seg(String equiposAsalto_Seg) {
        this.equiposAsalto_Seg = equiposAsalto_Seg;
    }
    public String getPersonal_Seg() {
        return personal_Seg;
    }
    public void setPersonal_Seg(String personal_Seg) {
        this.personal_Seg = personal_Seg;
    }
    @Override
    public String toString() {
        return "Seguridad de nivel Ligero{" +
                "Vehiculos de Seguridad: '" + vehiculos_Seg + '\'' +
                ", Equipos de Asalto destinados: '" + equiposAsalto_Seg + '\'' +
                ", Equipamiento de Seguridad Personal: '" + personal_Seg + '\'' +
                '}';
    }
}
