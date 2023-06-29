package Proyecto_Informatica_2;
public class RutaTransporte extends Transporte{
    private int numeroPedido_Tpt;
    private String tipoTransporte_Tpt;
    private String ciudadSalida_Tpt;
    private String ciudadLlegada_Tpt;
    private int horasdiasViaje_Tpt;
    private double distancia_Tpt;
    public RutaTransporte() {
    }
    public int getNumeroPedido_Tpt() {
        return numeroPedido_Tpt;
    }
    public void setNumeroPedido_Tpt(int numeroPedido_Tpt) {
        this.numeroPedido_Tpt = numeroPedido_Tpt;
    }
    public String getTipoTransporte_Tpt() {
        return tipoTransporte_Tpt;
    }
    public void setTipoTransporte_Tpt(String tipoTransporte_Tpt) {
        this.tipoTransporte_Tpt = tipoTransporte_Tpt;
    }
    public String getCiudadSalida_Tpt() {
        return ciudadSalida_Tpt;
    }
    public void setCiudadSalida_Tpt(String ciudadSalida_Tpt) {
        this.ciudadSalida_Tpt = ciudadSalida_Tpt;
    }
    public String getCiudadLlegada_Tpt() {
        return ciudadLlegada_Tpt;
    }
    public void setCiudadLlegada_Tpt(String ciudadLlegada_Tpt) {
        this.ciudadLlegada_Tpt = ciudadLlegada_Tpt;
    }
    public int getHorasdiasViaje_Tpt() {
        return horasdiasViaje_Tpt;
    }
    public void setHorasdiasViaje_Tpt(int horasdiasViaje_Tpt) {
        this.horasdiasViaje_Tpt = horasdiasViaje_Tpt;
    }
    public double getDistancia_Tpt() {
        return distancia_Tpt;
    }
    public void setDistancia_Tpt(double distancia_Tpt) {
        this.distancia_Tpt = distancia_Tpt;
    }
    @Override
    public String toString() {
        return "Ruta de Transporte{" +
                "Numero de Pedido: " + numeroPedido_Tpt +
                ", Tipo de Transporte: '" + tipoTransporte_Tpt + '\'' +
                ", Ciudad de Salida: '" + ciudadSalida_Tpt + '\'' +
                ", Ciudad de Llegada: '" + ciudadLlegada_Tpt + '\'' +
                ", Horas/Dias de Viaje: " + horasdiasViaje_Tpt +
                ", Distancia: " + distancia_Tpt +
                '}';
    }
}
