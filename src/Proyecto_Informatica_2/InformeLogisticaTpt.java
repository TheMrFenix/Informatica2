package Proyecto_Informatica_2;
public class InformeLogisticaTpt {
    private String admiOpinionCalidadVehiculo_Lgs;
    private String admiOpinionCalidadSeguridad_Lgs;
    private String admiEstadoInicialViaje_Lgs;
    private String admiEstadoDuranteViaje_Lgs;
    private String admiEstadoFinalViaje_Lgs;
    private String admiObservaciones_Lgs;
    public InformeLogisticaTpt() {
    }
    public String getAdmiOpinionCalidadVehiculo_Lgs() {
        return admiOpinionCalidadVehiculo_Lgs;
    }
    public void setAdmiOpinionCalidadVehiculo_Lgs(String admiOpinionCalidadVehiculo_Lgs) {
        this.admiOpinionCalidadVehiculo_Lgs = admiOpinionCalidadVehiculo_Lgs;
    }
    public String getAdmiOpinionCalidadSeguridad_Lgs() {
        return admiOpinionCalidadSeguridad_Lgs;
    }
    public void setAdmiOpinionCalidadSeguridad_Lgs(String admiOpinionCalidadSeguridad_Lgs) {
        this.admiOpinionCalidadSeguridad_Lgs = admiOpinionCalidadSeguridad_Lgs;
    }
    public String getAdmiEstadoInicialViaje_Lgs() {
        return admiEstadoInicialViaje_Lgs;
    }
    public void setAdmiEstadoInicialViaje_Lgs(String admiEstadoInicialViaje_Lgs) {
        this.admiEstadoInicialViaje_Lgs = admiEstadoInicialViaje_Lgs;
    }
    public String getAdmiEstadoDuranteViaje_Lgs() {
        return admiEstadoDuranteViaje_Lgs;
    }
    public void setAdmiEstadoDuranteViaje_Lgs(String admiEstadoDuranteViaje_Lgs) {
        this.admiEstadoDuranteViaje_Lgs = admiEstadoDuranteViaje_Lgs;
    }
    public String getAdmiEstadoFinalViaje_Lgs() {
        return admiEstadoFinalViaje_Lgs;
    }
    public void setAdmiEstadoFinalViaje_Lgs(String admiEstadoFinalViaje_Lgs) {
        this.admiEstadoFinalViaje_Lgs = admiEstadoFinalViaje_Lgs;
    }
    public String getAdmiObservaciones_Lgs() {
        return admiObservaciones_Lgs;
    }
    public void setAdmiObservaciones_Lgs(String admiObservaciones_Lgs) {
        this.admiObservaciones_Lgs = admiObservaciones_Lgs;
    }
    @Override
    public String toString() {
        return "Administracion Logistico de Informe de Transporte{" +
                "Administrar Opinion sobre Calidad del Vehiculo Asignado: '" + admiOpinionCalidadVehiculo_Lgs + '\'' +
                ", Administrar Opinion sobre la Calidad del Equipo de Seguridad: '" + admiOpinionCalidadSeguridad_Lgs + '\'' +
                ", Administrar Estado Inicial del Viaje: '" + admiEstadoInicialViaje_Lgs + '\'' +
                ", Administrar Estado Durante el Viaje: '" + admiEstadoDuranteViaje_Lgs + '\'' +
                ", Administrar Estado Final del Viaje:'" + admiEstadoFinalViaje_Lgs + '\'' +
                ", Administrar Observaciones: '" + admiObservaciones_Lgs + '\'' +
                '}';
    }
}
