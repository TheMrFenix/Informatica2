package Proyecto_Informatica_2;
public class InformeSeguridad {
    private String opinionCalidadEquipo_Seg;
    private String estadoInicialMision_Seg;
    private String estadoDuranteMision_seg;
    private String estadoFinalMision_Seg;
    private String observaciones_Seg;
    public InformeSeguridad() {
    }
    public String getOpinionCalidadEquipo_Seg() {
        return opinionCalidadEquipo_Seg;
    }
    public void setOpinionCalidadEquipo_Seg(String opinionCalidadEquipo_Seg) {
        this.opinionCalidadEquipo_Seg = opinionCalidadEquipo_Seg;
    }
    public String getEstadoInicialMision_Seg() {
        return estadoInicialMision_Seg;
    }
    public void setEstadoInicialMision_Seg(String estadoInicialMision_Seg) {
        this.estadoInicialMision_Seg = estadoInicialMision_Seg;
    }
    public String getEstadoDuranteMision_seg() {
        return estadoDuranteMision_seg;
    }
    public void setEstadoDuranteMision_seg(String estadoDuranteMision_seg) {
        this.estadoDuranteMision_seg = estadoDuranteMision_seg;
    }
    public String getEstadoFinalMision_Seg() {
        return estadoFinalMision_Seg;
    }
    public void setEstadoFinalMision_Seg(String estadoFinalMision_Seg) {
        this.estadoFinalMision_Seg = estadoFinalMision_Seg;
    }
    public String getObservaciones_Seg() {
        return observaciones_Seg;
    }
    public void setObservaciones_Seg(String observaciones_Seg) {
        this.observaciones_Seg = observaciones_Seg;
    }
    @Override
    public String toString() {
        return "Informe del Equipo de Seguridad Destinado{" +
                "Opinion sobre la Calidad de el Equipo: '" + opinionCalidadEquipo_Seg + '\'' +
                ", Estado Inicial de la Mision: '" + estadoInicialMision_Seg + '\'' +
                ", Estado Durante la Mision: '" + estadoDuranteMision_seg + '\'' +
                ", Estado Final de la Mision: '" + estadoFinalMision_Seg + '\'' +
                ", Observaciones: '" + observaciones_Seg + '\'' +
                '}';
    }
}
