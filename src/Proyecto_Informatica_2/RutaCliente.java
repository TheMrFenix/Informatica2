package Proyecto_Informatica_2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
public class RutaCliente extends Cliente{
    private int numeroPedido_Clt; // Clt=Cliente
    private String tipoTransporte_Clt; // por tierra, agua o aire.
    private String ciudadSalida_Clt;
    private String ciudadLlegada_Clt;
    private int horasdias_Viaje_Clt; // Estimado automatico sin Api porque no me da el tiempo
    private String tipoMercancias_Clt;
    private int cantidadMercancias_Clt;
    private double peso_Clt;
    private String destinatario_Clt;
    private double distancia_Clt; // porque si no no acabo nunca
    public RutaCliente() {
    }
    public int getNumeroPedido_Clt() {
        return numeroPedido_Clt;
    }
    public void setNumeroPedido_Clt(int numeroPedido_Clt) {
        this.numeroPedido_Clt = numeroPedido_Clt;
    }
    public String getTipoTransporte_Clt() {
        return tipoTransporte_Clt;
    }
    public void setTipoTransporte_Clt(String tipoTransporte_Clt) {
        this.tipoTransporte_Clt = tipoTransporte_Clt;
    }
    public String getCiudadSalida_Clt() {
        return ciudadSalida_Clt;
    }
    public void setCiudadSalida_Clt(String ciudadSalida_Clt) {
        this.ciudadSalida_Clt = ciudadSalida_Clt;
    }
    public String getCiudadLlegada_Clt() {
        return ciudadLlegada_Clt;
    }
    public void setCiudadLlegada_Clt(String ciudadLlegada_Clt) {
        this.ciudadLlegada_Clt = ciudadLlegada_Clt;
    }
    public int getHorasdias_Viaje_Clt() {
        return horasdias_Viaje_Clt;
    }
    public void setHorasdias_Viaje_Clt(int horasdias_Viaje_Clt) {
        this.horasdias_Viaje_Clt = horasdias_Viaje_Clt;
    }
    public String getTipoMercancias_Clt() {
        return tipoMercancias_Clt;
    }
    public void setTipoMercancias_Clt(String tipoMercancias_Clt) {
        this.tipoMercancias_Clt = tipoMercancias_Clt;
    }
    public int getCantidadMercancias_Clt() {
        return cantidadMercancias_Clt;
    }
    public void setCantidadMercancias_Clt(int cantidadMercancias_Clt) {
        this.cantidadMercancias_Clt = cantidadMercancias_Clt;
    }
    public double getPeso_Clt() {
        return peso_Clt;
    }
    public void setPeso_Clt(double peso_Clt) {
        this.peso_Clt = peso_Clt;
    }
    public String getDestinatario_Clt() {
        return destinatario_Clt;
    }
    public void setDestinatario_Clt(String destinatario_Clt) {
        this.destinatario_Clt = destinatario_Clt;
    }
    public double getDistancia_Clt(){
        return distancia_Clt;
    }
    public void setDistancia_Clt(double distancia_Clt){
        this.distancia_Clt = distancia_Clt;
    }
    @Override
    public String toString() {
        return "Ruta del Cliente{" +
                " Numero de Pedido: " + numeroPedido_Clt +
                ", Tipo de Transporte: '" + tipoTransporte_Clt + '\'' +
                ", Ciudad de Salida: '" + ciudadSalida_Clt + '\'' +
                ", Ciudad de Llegada: '" + ciudadLlegada_Clt + '\'' +
                ", Horas/Dias de Viaje: " + horasdias_Viaje_Clt +
                ", Tipo de Mercancias: '" + tipoMercancias_Clt + '\'' +
                ", Cantidad de Mercancias: " + cantidadMercancias_Clt +
                ", Peso: " + peso_Clt +
                ", Destinatario: '" + destinatario_Clt + '\'' +
                ", Distancia: '" + distancia_Clt + '\'' +
                '}';
    }
    public String calcularTiempoEstimado(){
        Map<String, Double> factoresTiempo=new HashMap<>();
        factoresTiempo.put("Tierra",1.0);
        factoresTiempo.put("Mar",2.0);
        factoresTiempo.put("Aire",0.5);
        double factorTiempo= factoresTiempo.getOrDefault(tipoTransporte_Clt.toLowerCase(),0.0);
        if (factorTiempo ==0.0){
            return "Tipo de transporte no valido";
        }
        double tiempoEstimado=(peso_Clt*distancia_Clt)/factorTiempo;
        return formatearTiempoEstimado(tiempoEstimado);
    }
    public String formatearTiempoEstimado(double tiempo){
        if (tiempo>=24){
            int dias=(int)tiempo/24;
            int horas=(int)tiempo%24;
            return dias+" dias y "+horas+" horas";
        } else {
            int horas=(int)tiempo;
            return horas+" horas";
        }
    }
    public void MenuRutaCliente(){
        Scanner sc=new Scanner(System.in);
        RutaCliente rutaCliente=new RutaCliente();
        ArrayList<RutaCliente> DatosRutaCliente=new ArrayList<>();

    }
}
