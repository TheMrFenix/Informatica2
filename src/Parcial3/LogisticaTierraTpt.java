package Parcial3;
public class LogisticaTierraTpt extends RutaLogistica{
    private String  admiTipoVehiculo_Lgs;
    private int  admiCantidadMercancias_Lgs;
    private double admiPesoMercancias_Lgs;
    private String admiProveedor_Lgs;
    private String admiDestinatario_Lgs;
    private String admiPosicionTrabajo_Lgs;
    public LogisticaTierraTpt() {
    }
    public String getAdmiTipoVehiculo_Lgs() {
        return admiTipoVehiculo_Lgs;
    }
    public void setAdmiTipoVehiculo_Lgs(String admiTipoVehiculo_Lgs) {
        this.admiTipoVehiculo_Lgs = admiTipoVehiculo_Lgs;
    }
    public int getAdmiCantidadMercancias_Lgs() {
        return admiCantidadMercancias_Lgs;
    }
    public void setAdmiCantidadMercancias_Lgs(int admiCantidadMercancias_Lgs) {
        this.admiCantidadMercancias_Lgs = admiCantidadMercancias_Lgs;
    }
    public double getAdmiPesoMercancias_Lgs() {
        return admiPesoMercancias_Lgs;
    }
    public void setAdmiPesoMercancias_Lgs(double admiPesoMercancias_Lgs) {
        this.admiPesoMercancias_Lgs = admiPesoMercancias_Lgs;
    }
    public String getAdmiProveedor_Lgs() {
        return admiProveedor_Lgs;
    }
    public void setAdmiProveedor_Lgs(String admiProveedor_Lgs) {
        this.admiProveedor_Lgs = admiProveedor_Lgs;
    }
    public String getAdmiDestinatario_Lgs() {
        return admiDestinatario_Lgs;
    }
    public void setAdmiDestinatario_Lgs(String admiDestinatario_Lgs) {
        this.admiDestinatario_Lgs = admiDestinatario_Lgs;
    }
    public String getAdmiPosicionTrabajo_Lgs() {
        return admiPosicionTrabajo_Lgs;
    }
    public void setAdmiPosicionTrabajo_Lgs(String admiPosicionTrabajo_Lgs) {
        this.admiPosicionTrabajo_Lgs = admiPosicionTrabajo_Lgs;
    }
    @Override
    public String toString() {
        return "Administracion Logistica Terrestre de Tranporte{" +
                "Administrar Tipo de Vehiculo:'" + admiTipoVehiculo_Lgs + '\'' +
                ", Administrar Cantidad de Mercancias: " + admiCantidadMercancias_Lgs +
                ", Administrar Peso de Mercancias: " + admiPesoMercancias_Lgs +
                ", Administrar Proveedor: '" + admiProveedor_Lgs + '\'' +
                ", Administrar Destinatario: '" + admiDestinatario_Lgs + '\'' +
                ", Administrar Posicion de Trabajo: '" + admiPosicionTrabajo_Lgs + '\'' +
                '}';
    }
}
