package Proyecto_Informatica_2;
public class TransporteAgua extends RutaTransporte{
    private String  tipoVehiculo_Tpt;
    private int  cantidadMercancias_Tpt;
    private double pesoMercancias_Tpt;
    private String proveedor_Tpt;
    private String destinatario_Tpt;
    private String posicionTrabajo_Tpt;
    public TransporteAgua() {
    }
    public String getTipoVehiculo_Tpt() {
        return tipoVehiculo_Tpt;
    }
    public void setTipoVehiculo_Tpt(String tipoVehiculo_Tpt) {
        this.tipoVehiculo_Tpt = tipoVehiculo_Tpt;
    }
    public int getCantidadMercancias_Tpt() {
        return cantidadMercancias_Tpt;
    }
    public void setCantidadMercancias_Tpt(int cantidadMercancias_Tpt) {
        this.cantidadMercancias_Tpt = cantidadMercancias_Tpt;
    }
    public double getPesoMercancias_Tpt() {
        return pesoMercancias_Tpt;
    }
    public void setPesoMercancias_Tpt(double pesoMercancias_Tpt) {
        this.pesoMercancias_Tpt = pesoMercancias_Tpt;
    }
    public String getProveedor_Tpt() {
        return proveedor_Tpt;
    }
    public void setProveedor_Tpt(String proveedor_Tpt) {
        this.proveedor_Tpt = proveedor_Tpt;
    }
    public String getDestinatario_Tpt() {
        return destinatario_Tpt;
    }
    public void setDestinatario_Tpt(String destinatario_Tpt) {
        this.destinatario_Tpt = destinatario_Tpt;
    }
    public String getPosicionTrabajo_Tpt() {
        return posicionTrabajo_Tpt;
    }
    public void setPosicionTrabajo_Tpt(String posicionTrabajo_Tpt) {
        this.posicionTrabajo_Tpt = posicionTrabajo_Tpt;
    }
    @Override
    public String toString() {
        return "Transporte por Mar{" +
                "Tipo de Vehiculo: '" + tipoVehiculo_Tpt + '\'' +
                ", Cantidad de Mercancias: " + cantidadMercancias_Tpt +
                ", Peso de Mercancias: " + pesoMercancias_Tpt +
                ", Proveedor: '" + proveedor_Tpt + '\'' +
                ", Destinatario: '" + destinatario_Tpt + '\'' +
                ", Posicion de Trabajo: '" + posicionTrabajo_Tpt + '\'' +
                '}';
    }
}
