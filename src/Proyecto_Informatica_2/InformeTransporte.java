package Proyecto_Informatica_2;
public class InformeTransporte {
    private String opinionCalidadVehiculo_Tpt;
    private String opinionCalidadSeguridad_Tpt;
    private String estadoInicialViaje_Tpt;
    private String estadoDuranteViaje_Tpt;
    private String estadoFinalViaje_Tpt;
    private String observaciones_Tpt;
    public InformeTransporte() {
    }
    public String getOpinionCalidadVehiculo_Tpt() {
        return opinionCalidadVehiculo_Tpt;
    }
    public void setOpinionCalidadSeguridad_Tpt(String opinionCalidadSeguridad_Tpt) {
        this.opinionCalidadSeguridad_Tpt = opinionCalidadSeguridad_Tpt;
    }
    public String getEstadoInicialViaje_Tpt() {
        return estadoInicialViaje_Tpt;
    }
    public void setEstadoInicialViaje_Tpt(String estadoInicialViaje_Tpt) {
        this.estadoInicialViaje_Tpt = estadoInicialViaje_Tpt;
    }
    public String getEstadoDuranteViaje_Tpt() {
        return estadoDuranteViaje_Tpt;
    }
    public void setEstadoDuranteViaje_Tpt(String estadoDuranteViaje_Tpt) {
        this.estadoDuranteViaje_Tpt = estadoDuranteViaje_Tpt;
    }
    public String getEstadoFinalViaje_Tpt() {
        return estadoFinalViaje_Tpt;
    }
    public void setEstadoFinalViaje_Tpt(String estadoFinalViaje_Tpt) {
        this.estadoFinalViaje_Tpt = estadoFinalViaje_Tpt;
    }
    public String getObservaciones_Tpt() {
        return observaciones_Tpt;
    }
    public void setObservaciones_Tpt(String observaciones_Tpt) {
        this.observaciones_Tpt = observaciones_Tpt;
    }
    @Override
    public String toString() {
        return "Informe de Transporte{" +
                "Opinion sobre Calidad del Vehiculo Asignado: '" + opinionCalidadVehiculo_Tpt + '\'' +
                ", Opinion sobre la Calidad del equipo de Seguridad: '" + opinionCalidadSeguridad_Tpt + '\'' +
                ", Estado Inicial del Viaje: '" + estadoInicialViaje_Tpt + '\'' +
                ", Estado Durante el Vieaje: '" + estadoDuranteViaje_Tpt + '\'' +
                ", Estado Final del Viaje: '" + estadoFinalViaje_Tpt + '\'' +
                ", Observaciones: '" + observaciones_Tpt + '\'' +
                '}';
    }
}
