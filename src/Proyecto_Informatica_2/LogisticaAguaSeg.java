package Proyecto_Informatica_2;
public class LogisticaAguaSeg extends LogisticaSeguridad{
    private String admiTiposEquipamiento_Lgs;
    private String admiTiposVehiculo_Lgs;
    private String admiRangos_Lgs;
    private int admiHorasEntrenamiento_Lgs;
    private int admiAnnosExperiencia_Lgs;
    public LogisticaAguaSeg() {
    }
    public String getAdmiTiposEquipamiento_Lgs() {
        return admiTiposEquipamiento_Lgs;
    }
    public void setAdmiTiposEquipamiento_Lgs(String admiTiposEquipamiento_Lgs) {
        this.admiTiposEquipamiento_Lgs = admiTiposEquipamiento_Lgs;
    }
    public String getAdmiTiposVehiculo_Lgs() {
        return admiTiposVehiculo_Lgs;
    }
    public void setAdmiTiposVehiculo_Lgs(String admiTiposVehiculo_Lgs) {
        this.admiTiposVehiculo_Lgs = admiTiposVehiculo_Lgs;
    }
    public String getAdmiRangos_Lgs() {
        return admiRangos_Lgs;
    }
    public void setAdmiRangos_Lgs(String admiRangos_Lgs) {
        this.admiRangos_Lgs = admiRangos_Lgs;
    }
    public int getAdmiHorasEntrenamiento_Lgs() {
        return admiHorasEntrenamiento_Lgs;
    }
    public void setAdmiHorasEntrenamiento_Lgs(int admiHorasEntrenamiento_Lgs) {
        this.admiHorasEntrenamiento_Lgs = admiHorasEntrenamiento_Lgs;
    }
    public int getAdmiAnnosExperiencia_Lgs() {
        return admiAnnosExperiencia_Lgs;
    }
    public void setAdmiAnnosExperiencia_Lgs(int admiAnnosExperiencia_Lgs) {
        this.admiAnnosExperiencia_Lgs = admiAnnosExperiencia_Lgs;
    }
    @Override
    public String toString() {
        return "Logistica Marina en Seguridad{" +
                "Administrar Tipos de Equipamiento: '" + admiTiposEquipamiento_Lgs + '\'' +
                ", Administrar Tipos de Vehiculo: '" + admiTiposVehiculo_Lgs + '\'' +
                ", Administrar Rangos: '" + admiRangos_Lgs + '\'' +
                ", Administrar Horas de Entrenamiento: " + admiHorasEntrenamiento_Lgs +
                ", Administrar Años de Experiencia: " + admiAnnosExperiencia_Lgs +
                '}';
    }
}
