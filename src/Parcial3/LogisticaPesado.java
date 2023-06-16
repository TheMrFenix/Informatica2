package Parcial3;
public class LogisticaPesado extends LogisticaRiesgo{
    private int admiCantidadVehiculos_Lgs;
    private int admiCantidadSuministros_Lgs;
    private int admiCantidadEquipos_Lgs;
    public LogisticaPesado() {
    }
    public int getAdmiCantidadVehiculos_Lgs() {
        return admiCantidadVehiculos_Lgs;
    }
    public void setAdmiCantidadVehiculos_Lgs(int admiCantidadVehiculos_Lgs) {
        this.admiCantidadVehiculos_Lgs = admiCantidadVehiculos_Lgs;
    }
    public int getAdmiCantidadSuministros_Lgs() {
        return admiCantidadSuministros_Lgs;
    }
    public void setAdmiCantidadSuministros_Lgs(int admiCantidadSuministros_Lgs) {
        this.admiCantidadSuministros_Lgs = admiCantidadSuministros_Lgs;
    }
    public int getAdmiCantidadEquipos_Lgs() {
        return admiCantidadEquipos_Lgs;
    }
    public void setAdmiCantidadEquipos_Lgs(int admiCantidadEquipos_Lgs) {
        this.admiCantidadEquipos_Lgs = admiCantidadEquipos_Lgs;
    }
    @Override
    public String toString() {
        return "Logistica de Nivel Pesado{" +
                "Administrar Cantidad de Vehiculos de Seguridad: " + admiCantidadVehiculos_Lgs +
                ", Administrar Cantidad de  Suministros: " + admiCantidadSuministros_Lgs +
                ", Administrar Cantidad de Equipos de Asalto destinados: " + admiCantidadEquipos_Lgs +
                '}';
    }
}
