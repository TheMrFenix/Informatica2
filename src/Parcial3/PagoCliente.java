package Parcial3;
public class PagoCliente extends RutaCliente{
    private RutaCliente ruta_Clt;
    private int cuentaBancaria_Clt;
    private double cantidadPago_Clt;
    private NiveldeRiesgo seguridadDestinada_Clt;

    public PagoCliente() {
    }
    public RutaCliente getRuta_Clt() {
        return ruta_Clt;
    }
    public void setRuta_Clt(RutaCliente ruta_Clt) {
        this.ruta_Clt = ruta_Clt;
    }
    public int getCuentaBancaria_Clt() {
        return cuentaBancaria_Clt;
    }
    public void setCuentaBancaria_Clt(int cuentaBancaria_Clt) {
        this.cuentaBancaria_Clt = cuentaBancaria_Clt;
    }
    public double getCantidadPago_Clt() {
        return cantidadPago_Clt;
    }
    public void setCantidadPago_Clt(double cantidadPago_Clt) {
        this.cantidadPago_Clt = cantidadPago_Clt;
    }
    public NiveldeRiesgo getSeguridadDestinada_Clt() {
        return seguridadDestinada_Clt;
    }
    public void setSeguridadDestinada_Clt(NiveldeRiesgo seguridadDestinada_Clt) {
        this.seguridadDestinada_Clt = seguridadDestinada_Clt;
    }
    @Override
    public String toString() {
        return "Pago del Cliente{" +
                "por Peso de Mercancias: " + getPeso_Clt() +
                "por Seguridad destinada: 100000" +
                ", por Ruta: " + ruta_Clt +
                ", Cuenta Bancaria: " + cuentaBancaria_Clt +
                ", Cantidad de Pago: " + cantidadPago_Clt +
                '}';
    }
    public double calcularPago(){
        double peso= ruta_Clt.getPeso_Clt();
        double distancia= ruta_Clt.getDistancia_Clt();
        double p = peso*distancia*0.1;
        double pago= p+100000;
        return pago;
    }
    /*public double pagoConSeguridad(){
no hay tiempo para detallar
    }*/
}
