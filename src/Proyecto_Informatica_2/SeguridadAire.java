package Proyecto_Informatica_2;
public class SeguridadAire extends Seguridad{
    private String tipoEquipamiento_Seg;
    private String tipoVehiculo_Seg;
    private String rango_Seg;
    private int horasEntrenamietno_Seg;
    private int annosExperiencia_Seg;
    public SeguridadAire() {
    }
    public String getTipoEquipamiento_Seg() {
        return tipoEquipamiento_Seg;
    }
    public void setTipoEquipamiento_Seg(String tipoEquipamiento_Seg) {
        this.tipoEquipamiento_Seg = tipoEquipamiento_Seg;
    }
    public String getTipoVehiculo_Seg() {
        return tipoVehiculo_Seg;
    }
    public void setTipoVehiculo_Seg(String tipoVehiculo_Seg) {
        this.tipoVehiculo_Seg = tipoVehiculo_Seg;
    }
    public String getRango_Seg() {
        return rango_Seg;
    }
    public void setRango_Seg(String rango_Seg) {
        this.rango_Seg = rango_Seg;
    }
    public int getHorasEntrenamietno_Seg() {
        return horasEntrenamietno_Seg;
    }
    public void setHorasEntrenamietno_Seg(int horasEntrenamietno_Seg) {
        this.horasEntrenamietno_Seg = horasEntrenamietno_Seg;
    }
    public int getAnnosExperiencia_Seg() {
        return annosExperiencia_Seg;
    }
    public void setAnnosExperiencia_Seg(int annosExperiencia_Seg) {
        this.annosExperiencia_Seg = annosExperiencia_Seg;
    }
    @Override
    public String toString() {
        return "Seguridad en Area del Aire{" +
                "Tipo de Equipamiento: '" + tipoEquipamiento_Seg + '\'' +
                ", Tipo de Vehiculo: '" + tipoVehiculo_Seg + '\'' +
                ", Rango: '" + rango_Seg + '\'' +
                ", Horas de Entrenamietno: " + horasEntrenamietno_Seg +
                ", Años de Experiencia: " + annosExperiencia_Seg +
                '}';
    }
}
