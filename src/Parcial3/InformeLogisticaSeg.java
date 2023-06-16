package Parcial3;
public class InformeLogisticaSeg {
    private String admiOpinionCalidadEquipo_Lgs;
    private String admiEstadoInicialMision_Lgs;
    private String admiEstadoDuranteMision_Lgs;
    private String admiEstadoFinalMision_Lgs;
    private String admiObservaciones_Lgs;
    public InformeLogisticaSeg() {
    }
    public String getAdmiOpinionCalidadEquipo_Lgs() {
        return admiOpinionCalidadEquipo_Lgs;
    }
    public void setAdmiOpinionCalidadEquipo_Lgs(String admiOpinionCalidadEquipo_Lgs) {
        this.admiOpinionCalidadEquipo_Lgs = admiOpinionCalidadEquipo_Lgs;
    }
    public String getAdmiEstadoInicialMision_Lgs() {
        return admiEstadoInicialMision_Lgs;
    }
    public void setAdmiEstadoInicialMision_Lgs(String admiEstadoInicialMision_Lgs) {
        this.admiEstadoInicialMision_Lgs = admiEstadoInicialMision_Lgs;
    }
    public String getAdmiEstadoDuranteMision_Lgs() {
        return admiEstadoDuranteMision_Lgs;
    }
    public void setAdmiEstadoDuranteMision_Lgs(String admiEstadoDuranteMision_Lgs) {
        this.admiEstadoDuranteMision_Lgs = admiEstadoDuranteMision_Lgs;
    }
    public String getAdmiEstadoFinalMision_Lgs() {
        return admiEstadoFinalMision_Lgs;
    }
    public void setAdmiEstadoFinalMision_Lgs(String admiEstadoFinalMision_Lgs) {
        this.admiEstadoFinalMision_Lgs = admiEstadoFinalMision_Lgs;
    }
    public String getAdmiObservaciones_Lgs() {
        return admiObservaciones_Lgs;
    }
    public void setAdmiObservaciones_Lgs(String admiObservaciones_Lgs) {
        this.admiObservaciones_Lgs = admiObservaciones_Lgs;
    }
    @Override
    public String toString() {
        return "Revision Logistico de Informe de Seguridad{" +
                "Administrar Opinion de Calidad del Equipo Proporsionado: '" + admiOpinionCalidadEquipo_Lgs + '\'' +
                ", Administrar Estado Inicial de la Mision: '" + admiEstadoInicialMision_Lgs + '\'' +
                ", Administrar Estado Durante la Mision: '" + admiEstadoDuranteMision_Lgs + '\'' +
                ", Administrar Estado Final de la Mision: '" + admiEstadoFinalMision_Lgs + '\'' +
                ", Administrar Observaciones: '" + admiObservaciones_Lgs + '\'' +
                '}';
    }
}
