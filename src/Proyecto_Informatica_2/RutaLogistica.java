package Proyecto_Informatica_2;
public class RutaLogistica extends LogisticaTransporte{
    private int admiNumeroPedido_Lgs;
    private String admiTipoTransporte_Lgs;
    private String admiCiudadSalida_Lgs;
    private String admiCiudadLlegada_Lgs;
    private int admihorasdiasViaje_Lgs;
    private double admiDistancia_Lgs;
    public RutaLogistica() {
    }
    public int getAdmiNumeroPedido_Lgs() {
        return admiNumeroPedido_Lgs;
    }
    public void setAdmiNumeroPedido_Lgs(int admiNumeroPedido_Lgs) {
        this.admiNumeroPedido_Lgs = admiNumeroPedido_Lgs;
    }
    public String getAdmiTipoTransporte_Lgs() {
        return admiTipoTransporte_Lgs;
    }
    public void setAdmiTipoTransporte_Lgs(String admiTipoTransporte_Lgs) {
        this.admiTipoTransporte_Lgs = admiTipoTransporte_Lgs;
    }
    public String getAdmiCiudadSalida_Lgs() {
        return admiCiudadSalida_Lgs;
    }
    public void setAdmiCiudadSalida_Lgs(String admiCiudadSalida_Lgs) {
        this.admiCiudadSalida_Lgs = admiCiudadSalida_Lgs;
    }
    public String getAdmiCiudadLlegada_Lgs() {
        return admiCiudadLlegada_Lgs;
    }
    public void setAdmiCiudadLlegada_Lgs(String admiCiudadLlegada_Lgs) {
        this.admiCiudadLlegada_Lgs = admiCiudadLlegada_Lgs;
    }
    public int getAdmihorasdiasViaje_Lgs() {
        return admihorasdiasViaje_Lgs;
    }
    public void setAdmihorasdiasViaje_Lgs(int admihorasdiasViaje_Lgs) {
        this.admihorasdiasViaje_Lgs = admihorasdiasViaje_Lgs;
    }
    public double getAdmiDistancia_Lgs() {
        return admiDistancia_Lgs;
    }
    public void setAdmiDistancia_Lgs(double admiDistancia_Lgs) {
        this.admiDistancia_Lgs = admiDistancia_Lgs;
    }
    @Override
    public String toString() {
        return "Administracion Logistica de Ruta de Transporte{" +
                "Administrar Numero de Pedido: " + admiNumeroPedido_Lgs +
                ", Administrar Tipo de Transporte: '" + admiTipoTransporte_Lgs + '\'' +
                ", Administrar Ciudad de Salida: '" + admiCiudadSalida_Lgs + '\'' +
                ", Administrar Ciudad de Llegada: '" + admiCiudadLlegada_Lgs + '\'' +
                ", Administrar Horas/Dias de Viaje: " + admihorasdiasViaje_Lgs +
                ", Administrar Distancia: " + admiDistancia_Lgs +
                '}';
    }
}
